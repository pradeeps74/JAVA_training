package com.training.second;

public class Hospital implements Billable{

	String hospitalName;
	String hospitalAddress;
	String phoneNumber;
	int billNumber;
	double counsultationFee;
	public Hospital() {
		//initialize the variable 
		hospitalName="KMc hospital";
		hospitalAddress="KMC hospital,coimbatore";
		phoneNumber="91+9791280195";
		billNumber=0777;
		counsultationFee=1500.89;
	}
	public Hospital(String hospitalName,String hospitalAddress,String phoneNumber,int billNumber,
			double counsultationFee) {
		//initialize the variable 
		this.hospitalName=hospitalName;this.hospitalAddress=hospitalAddress;this.phoneNumber=phoneNumber;
		this.billNumber=billNumber;this.counsultationFee=counsultationFee;
		
	}
	
	public void display() {
		//println of hospital's name,address,phone;
		System.out.println("Hospital Nmae : "+" "+hospitalName);
		System.out.println("Hospital Address : "+" "+hospitalAddress);
		System.out.println("Hospital phone no : "+" "+phoneNumber);
		System.out.println("bill no: "+" "+billNumber);
		System.out.println("consultation fees: "+" "+counsultationFee);
		
	}
	public String display(String hospitalName,String hospitalAddress,String phoneNumber,int billNumber,
			double counsultationFee) {
		this.hospitalName=hospitalName;this.hospitalAddress=hospitalAddress;this.phoneNumber=phoneNumber;
		this.billNumber=billNumber;this.counsultationFee=counsultationFee;
		return "Hospital Nmae : "+" "+hospitalName +'\n' +"Hospital Address : "+hospitalAddress+'\n'+
				"Hospital phone no : "+" "+phoneNumber +'\n'+"bill no: "+" "+billNumber+'\n'
				+"consultation fees: "+" "+counsultationFee;
	}
	
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Hospital Details "+hospitalName+" "+hospitalAddress+" "+phoneNumber;
	}
	
	public double calculateBill() {
		// TODO Auto-generated method stub
		//counsultationFee=666.4;
		return billNumber + +counsultationFee;
	}

	public String displayBillDetails() {
		// TODO Auto-generated method stub
		return "Hospital Nmae : "+" "+hospitalName +"Hospital Address : "+" "+hospitalAddress+
				"Hospital phone no : "+" "+phoneNumber +"bill no: "+" "+billNumber+"consultation fees: "+" "+counsultationFee;
	}
	

}
