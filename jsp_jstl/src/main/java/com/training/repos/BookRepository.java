package com.training.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.jstl.servlet.Book;
import com.training.connection.DbConnection;
import com.training.interfaces.CrudRepository;

public class BookRepository implements CrudRepository<Book> {
	Connection con;
	private List<Book> bookList;

	public BookRepository() throws SQLException {
		super();
		//get the connection
		DbConnection.getConnection();
		this.bookList = new ArrayList<Book>();
	}

	@Override
	public Book add(Book t) {
		boolean isAdded =this.bookList.add(t);
		if(isAdded) {
			return t;
		}
		else {
			return null;
		}
		//PrearedSTatement pstmt = con.pre
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book findByName(String bookName) {
		Optional <Book> found=this.bookList.stream().filter(e -> e.getBookName().equals(bookName)).findFirst();
		return found.get();
	}

	@Override
	public Book insert(Book t) {
		try {
			Connection connection =DbConnection.getConnection();
			PreparedStatement prepeareStatement = connection.prepareStatement("");
			prepeareStatement.setInt(1,t.getBookNumber());
			prepeareStatement.setString(2,t.getBookName());
			prepeareStatement.setString(3,t.getAuthorName());
			prepeareStatement.setDouble(4,t.getPrice());
			prepeareStatement.executeUpdate();
			connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return t;
	}



	

	

}
