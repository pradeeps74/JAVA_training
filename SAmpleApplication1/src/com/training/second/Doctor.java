package com.training.second;

public class Doctor extends Person{
	int practicLicenceNumber;
	String specialization;
	String clinicalAddress;
	
	public Doctor()
	{
		practicLicenceNumber=777;
		specialization="cardiologist";
		clinicalAddress="Salem Govt.Hr.Sec.school,salem";
	}
	@Override
	public String toString() {
		return "Doctor [practicLicenceNumber=" + practicLicenceNumber + ", specialization=" + specialization
				+ ", clinicalAddress=" + clinicalAddress + "]";
	}
	public Doctor(int practicallicno,String specName,String clinicalAdd)
	{
		this.practicLicenceNumber=practicallicno;
		this.specialization=specName;
		this.clinicalAddress=clinicalAdd;
	}
	public Doctor(String personName,String personAddress,long personMbno,int practicallicno,String specName,String clinicalAdd)
	{super(personName,personAddress,personMbno);
		this.practicLicenceNumber=practicallicno;
		this.specialization=specName;
		this.clinicalAddress=clinicalAdd;
	}
	public String display() {
		super.transactionDetails();
		return "practicLicenceNumber is :"+practicLicenceNumber;
}
	public String display(int practicLicenceNumber,String specialization,String clinicalAddress) {
		super.transactionDetails();
		this.practicLicenceNumber=practicLicenceNumber;
		this.specialization=specialization;
		this.clinicalAddress=clinicalAddress;
		return "practicLicenceNumber is :"+practicLicenceNumber+"ClinicalAddress is:"+clinicalAddress+"Specilization is "+specialization;
}
}
