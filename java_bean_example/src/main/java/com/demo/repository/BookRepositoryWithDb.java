package com.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.demo.ifaces.CrudRepository;
import com.example.demo.model.Book;

public class BookRepositoryWithDb implements CrudRepository<Book> {
	private Connection connection;

	public BookRepositoryWithDb(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public Book add(Book t) {
		String sql = "insert into book values(?,?,?,?);";
		int rowAdded=0 ;
		try {
			PreparedStatement pstmt =connection.prepareStatement(sql);
			
			pstmt.setInt(1, t.getBookNumber());
			pstmt.setString(2, t.getBookName());
			pstmt.setString(3, t.getAuthorName());
			pstmt.setDouble(4, t.getPrice());
			 rowAdded =pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return rowAdded==1?t:null;
	}

	@Override
	public List<Book> findAll() {
		String sql = "select * from book";
		List<Book> bookList=new ArrayList();
		try (PreparedStatement pstmt=connection.prepareStatement(sql);){
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int bookNumber=rs.getInt("bookNumber");
				String bookName=rs.getString("bookName");
			String authorName=rs.getString("authorName");;
			 double price=rs.getDouble("price");
			 Book eachBook = new Book(bookNumber,bookName,authorName,price);
			 bookList.add(eachBook);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}
		return bookList;
	}

	@Override
	public List<Book> findByName(String bookName) {
		String sql="select * from book where bookName=?;";
		List<Book> bookList=new ArrayList();
		try(PreparedStatement pstmt =connection.prepareStatement(sql)){
			pstmt.setString(1, bookName);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int bookNumber=rs.getInt("bookNumber"); 
			String authorName=rs.getString("authorName");;
			 double price=rs.getDouble("price");
			 //bookList = new Book(bookNumber,bookName,authorName,price);
			
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Book removeById(int id) {
		String sql = "delete from book where bookNumber=?;";
		int rowDeleted=0 ;
		try(PreparedStatement pstmt =connection.prepareStatement(sql);) {
			
			
			pstmt.setInt(1, id);
		
			rowDeleted =pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted==1?findById(id):null;
		
	}

	public Book findById(int id) {
		
		String sql = "select * from book where bookNumber=?;";
		Book foundBook=null;
		try(PreparedStatement pstmt=connection.prepareStatement(sql);) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int bookNumber=rs.getInt("bookNumber");
				String bookName=rs.getString("bookName");
			String authorName=rs.getString("authorName");;
			 double price=rs.getDouble("price");
			 foundBook = new Book(bookNumber,bookName,authorName,price);
			
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}
		return foundBook;
	}
	public Book updateBook(Book t) {
		String sql = "update  book set bookName=?,authorName=?,price=? where bookNumber=?";
		int rowUpdated=0 ;
		try {
			PreparedStatement pstmt =connection.prepareStatement(sql);
			
			
			pstmt.setString(1, t.getBookName());
			pstmt.setString(2, t.getAuthorName());
			pstmt.setDouble(3, t.getPrice());
			pstmt.setInt(4, t.getBookNumber());
			rowUpdated =pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated==1?t:null;
		
	}

}
