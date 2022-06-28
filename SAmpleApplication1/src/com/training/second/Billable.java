package com.training.second;

public interface Billable {
	String getDetails();
	double calculateBill();
	String displayBillDetails();
	
	//Declare default methods
	default void show() {
		System.out.println("Thank you , we pray for your quick recovery");
	}
	//Declare Static method

	static void greeting()
	{
		System.out.println("All is well");
	}
	}
