package com.jstl.training.services;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import com.jstl.servlet.Book;
import com.training.interfaces.CrudRepository;
import com.training.repos.BookRepository;

public class BookService {
	//private List<Book> bookList;
private CrudRepository<Book> repo;
	public BookService() throws SQLException {
		super();
//		this.bookList=Arrays.asList(new Book(1010,"Head First Java","Kathy Steera",450),
//				                    new Book(1011,"Thinking in Java","Bruce Erekal",750)
//				                    );
		this.repo=new BookRepository();
	}
	public List<Book> findAll(){
//		return this.bookList;
		return this.repo.findAll();
	}
	public Book add(Book entity) {
		return this.repo.add(entity);
	}
	public Book findBookByName(String bookName) {
		return this.repo.findByName(bookName);
	}
	public Book insert(Book entity) {
		// TODO Auto-generated method stub
		return this.repo.insert(entity);
	}

}
