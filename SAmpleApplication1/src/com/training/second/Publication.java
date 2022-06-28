package com.training.second;
public class Publication {
	String title;
	float price;
	public Publication()
	{
		title="Vikramathithiyan";
		price=599.07f;
	}
	public Publication(String title,float price)
	{
		this.title=title;
		this.price=price;
	}
	
	
	public String display()
	{
		return "title: "+title + " price: "+price ;
	}
	}
