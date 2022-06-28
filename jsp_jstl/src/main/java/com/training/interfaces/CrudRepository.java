package com.training.interfaces;

import java.util.List;

import com.jstl.servlet.Book;



public interface CrudRepository<T> {
	public T add(T t);
	public List<T> findAll();
	public Book findByName(String bookName);
	public T  insert(T t);
}
 