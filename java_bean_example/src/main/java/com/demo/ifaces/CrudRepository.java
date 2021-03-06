package com.demo.ifaces;

import java.util.List;
import com.example.demo.model.*;
public interface CrudRepository<T> {
	public T add(T t);
	public List<T> findAll();
	public List<Book>findByName(String bookName);
	public T removeById(int id);
	public T findById(int id);
	public T updateBook(T t);
	
	//public T  insert(T t);
}
 