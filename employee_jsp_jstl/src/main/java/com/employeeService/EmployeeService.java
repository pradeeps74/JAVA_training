package com.employeeService;

import java.util.Arrays;
import java.util.List;

import com.crudIfaces.CrudRepository;
import com.employeeClassAndServlet.Employee;
import com.repository.EmployeeRepository;


public class EmployeeService {
	//private List<Employee> employeeList;
	private CrudRepository<Employee> repo;
	public EmployeeService() {
		super();
		// TODO Auto-generated constructor stub
//		
		this.repo=new EmployeeRepository();
	}
	
	public List<Employee> findAll() {
		//return this.employeeList;
		return this.repo.findAll();
	}
	public Employee add(Employee entity) {
		//return this.employeeList;
		return this.repo.add(entity);
	}

}
