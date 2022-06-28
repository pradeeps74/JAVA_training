package com.practice.service;

import java.sql.Connection;
import java.util.List;

import com.practice.iface.CrudRepository;
import com.practice.model.Employee;
import com.practice.repository.EmployeeRepositoryDb;

public class EmployeeService {
	private Connection connection;
	private CrudRepository<Employee> repo;
 
	
	public EmployeeService(Connection connection) {
		super();
	
		this.connection=connection;
		this.repo=new EmployeeRepositoryDb(connection);
		
	}
	public Employee add(Employee employee) {
		return this.repo.add(employee);
	}
	public List<Employee> findAll(){
		return this.repo.findAll();
	}
}
