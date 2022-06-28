package com.crud;

public class Employee {
	private int age;
	private String employeeId ,employeeName,designation,phoneNumber ,salary;
	public Employee(int age, String employeeId, String employeeName, String designation, String phoneNumber,
			String salary) {
		super();
		this.age = age;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
