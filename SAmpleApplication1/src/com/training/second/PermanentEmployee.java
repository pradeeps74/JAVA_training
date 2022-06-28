package com.training.second;

import java.util.Date;

public class PermanentEmployee extends Employee
{
	int basic;
	int hra;
	Date dateofJoining;
	public PermanentEmployee()
	{
		basic=45000;hra=3000;
		System.out.println("PermanentEmployee default constructor called");
	}
	public PermanentEmployee(int basic,int hra) {
		this.basic=basic;
		this.hra=hra;
		System.out.println("PermanentEmployee parameterized constructor called");
	}
	public PermanentEmployee(int basic,int hra,String id,String name,Date dateofJoining) {
		super(id,name,dateofJoining);//function calls
		this.basic=basic;
		this.hra=hra;
		System.out.println("PermanentEmployee parameterized constructor called");
	}
	
	//redefining display(), method overriding
	public String display() {
		
		System.out.println(super.display());//calling super class method using Super keyword
		return "basic :"+basic;
	}
	public String display(int hra) {
		return "display :"+hra;
	}
}
