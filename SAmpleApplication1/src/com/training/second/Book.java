package com.training.second;

public class Book extends Publication{
	int pageCount;
	public Book() {
		pageCount=599;
	}
	public Book(int pgCount)
	{
		this.pageCount=pgCount;
	}
	public Book(int pgCount,String title,float price)
	{
		super(title,price);
		this.pageCount=pgCount;
	}
	public String user_input()
	{
		return "pageCount is :"+pageCount;
	}
	public String display() 
	{
		System.out.println(super.display());
		return "Pagecount of book is"+pageCount;
	}
	public String display(int pageCount) 
	{
		System.out.println(super.display());
		return "Pagecount of book is"+pageCount;
	}
	

}
