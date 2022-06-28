package com.practice.model;

public class Employee {
 private int employeeId;
 private String employeeName;
 private String phoneNo;
 private double salary;
 private String city;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employeeId, String employeeName, String phoneNo, double salary, String city) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.phoneNo = phoneNo;
	this.salary = salary;
	this.city = city;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", phoneNo=" + phoneNo
			+ ", salary=" + salary + ", city=" + city + "]";
}
 
}
