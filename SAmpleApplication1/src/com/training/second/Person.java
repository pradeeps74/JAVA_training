package com.training.second;

public class Person implements Transactions {
	String name;
	String address;
	long phno;
	public Person()
	{
		name ="Pradeep";
		address="sankagiri west,salem";
		phno=9791280195l;
	}
	public Person(String personName,String personAddress,long personMbno)
	{
		this.name=personName;
		this.address=personAddress;
		this.phno=personMbno;	
	}
	public void transactionDetails() {
		System.out.println("Name is :"+name+"Address is :"+address+"Phone is :"+phno);
	}
	public String display(String name,String address,long phno)
	{
		this.name=name;
		this.address=address;
		this.phno=phno;
		return"Name is :"+name+"Address is :"+address+"Phone is :"+phno;
	}
	
}
