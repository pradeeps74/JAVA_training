package com.demo.service;

import java.sql.Connection;
import java.sql.SQLException;

import java.util.List;


import com.demo.ifaces.CrudRepository;

import com.demo.repository.BookRepositoryWithDb;
import com.example.demo.model.Book;

public class BookService {
	//private List<Book> bookList;
	private Connection connection;
private CrudRepository<Book> repo;
	public BookService(Connection connection) throws SQLException {
		super();
//		this.bookList=Arrays.asList(new Book(1010,"Head First Java","Kathy Steera",450),
//				                    new Book(1011,"Thinking in Java","Bruce Erekal",750)
//				                    );
		//this.repo=new BookRepository();
		this.connection=connection;
		this.repo=new BookRepositoryWithDb(connection);
	}
	public List<Book> findAll(){
//		return this.bookList;
		//this.repo.add(new Book(101,"java","pradhu",478));//
		return this.repo.findAll();
	}
	public Book add(Book entity) {
		return this.repo.add(entity);
	}
	public Book remove(int id) {
		return this.repo.removeById(id);
		
	}
	public List<Book> findBookByName(String bookName) {
		return this.repo.findByName(bookName);
	}
	public Book findBookById(int id) {
		return this.repo.findById(id);
	}
	public Book update(Book id) {
		return this.repo.updateBook(id);
	}


}
