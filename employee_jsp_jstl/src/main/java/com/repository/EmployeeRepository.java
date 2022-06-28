package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.crudIfaces.CrudRepository;
import com.employeeClassAndServlet.Employee;

public class EmployeeRepository implements CrudRepository<Employee> {
	private List<Employee> employeeList;

	public EmployeeRepository() {
		super();
		this.employeeList=new ArrayList<Employee>();
	}

	@Override
	public Employee add(Employee t) {
		boolean isAdded = this.employeeList.add(t);
		if (isAdded) {
			return t;
		} else {
			return null;
		}
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return this.employeeList;
	}

}
