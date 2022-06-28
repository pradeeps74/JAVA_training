package com.training.serialization;

import java.io.Serializable;
//Serializable is a marker interface,does not contain any members in it.
public class EmployeeDetailsForSerialization implements Serializable{

	
	//private static final long serialVersionUID = 1L;
	
	String name;
	int age;
	transient int x;
	static int count ;
	long phoneNo;

	
	public EmployeeDetailsForSerialization(String name,int age,long phoneNo,int a , int b) 
	{
		this.name=name;
		this.age=age;
		this.phoneNo=phoneNo;
		x=a;
		count=b;
		
	}
}
