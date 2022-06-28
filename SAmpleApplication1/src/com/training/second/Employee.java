 package com.training.second;
import java.util.*;
public class Employee {
	//static final int SIZE=5;
	private String empId;
	private String empName;
	private static int empCount=0;//common for all the objects of the class
	 Date joiningDate;
	public Employee()
	{
		empId="777";
		empName="pradeep";
		 joiningDate=new Date();
		System.out.println("Employee default constructor called");
		empCount++;
	}
	public Employee(String id,String name,Date joiningDate) {
		this.empId=id;
		this.empName=name;
		this.joiningDate=joiningDate;
		System.out.println("Employee parameterixed constructor called");
		empCount++;
	}
	public String display()
	{
		return "ID: "+empId + " Name: "+empName + " Employee count: " + empCount+"Joining date is:"+joiningDate;
	}
	 public static void displayCount()
	 {
		 empCount=777;
		 System.out.println("Total number of Employees"+empCount);
	 }
}

