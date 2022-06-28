package com.training.second;

public class Shop implements Billable{
	static String shopName;
	static String shopAddress;
	static String phoneNumber;
	int billNumber;
	String product;
	double total;
	public Shop() {
		//initialize the variable 
		shopName="teche";
		shopAddress="sankagiri,salem";
		phoneNumber="91+9791280195";
		billNumber=07;
		product="chocolates";
		total=50.01;
	}
	public Shop(String shopName,String shopAddress,String phoneNumber,int billNumber,
			String product,double total) {
		//initialize the variable 
		this.shopName=shopName;this.shopAddress=shopAddress;this.phoneNumber=phoneNumber;
		this.billNumber=billNumber;this.product=product;total=total;
		
	}
	public void display() {
		//println of hospital's name,address,phone;
		System.out.println("Shop Nmae : "+" "+shopName);
		System.out.println("Shop Address : "+" "+shopAddress);
		System.out.println("Hospital phone no : "+" "+phoneNumber);
		System.out.println("bill no: "+" "+billNumber);
		System.out.println("product: "+" "+product);
		System.out.println("Total amount: "+" "+total);
	}
	
	public String display(String shopName,String shopAddress,String phoneNumber,int billNumber,
			String product,double total) {
		return "Shop Nmae : "+" "+shopName +'\n' +"shop Address : "+shopAddress+'\n'+
				"Shop phone no : "+" "+phoneNumber +'\n'+"bill no: "+" "+billNumber+'\n'
				+"product name is "+product+'\n'+"Toatl amount: "+" "+total;
	}
	
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Shop Nmae : "+" "+shopName +'\n' +"shop Address : "+shopAddress+'\n'+
			"Shop phone no : "+" "+phoneNumber;
	}
	
	public double calculateBill() {
		// TODO Auto-generated method stub
		return total;
	}

	public String displayBillDetails() {
		// TODO Auto-generated method stub
		return "bill no: "+" "+billNumber+'\n'
				+"product name is "+product+'\n'+"Toatl amount: "+" "+total;
	}
	
}
