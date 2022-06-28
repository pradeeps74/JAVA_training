package com.training.second;

import java.util.Date;

public class ContractEmployee extends Employee{
	String duration;
	float rate;
	Date dateofJoining;
	public ContractEmployee()
	{
		duration="10 hrs";
		rate=550.05f;
	}
	public ContractEmployee(String duration,float rate)
	{
		this.duration=duration;
		this.rate=rate;
	}
	public ContractEmployee(String duration,float rate,String id,String name,Date dateofJoining)
	{
		super(id,name,dateofJoining);
		this.duration=duration;
		this.rate=rate;
	}
	public String display() {
		System.out.println(super.display());
		return "durration: "+duration+"rate: "+rate;
	}
}
