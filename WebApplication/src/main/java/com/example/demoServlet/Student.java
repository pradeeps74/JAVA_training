package com.example.demoServlet;

public class Student {
	private int rollNumber;
	private String studentName;
	private double mark;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int rollNumber, String studentName, double mark) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.mark = mark;
	}


	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}


//	@Override
//	public String toString() {
//		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", mark=" + mark + "]";
//	}


}
