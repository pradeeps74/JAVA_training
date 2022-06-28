package com.training.second;
import java.util.Scanner;
public class Triangle extends Shape {
	int height;
	int width;
	double areaOfTriangle;
	public void getDetails(Scanner sc)
	{
		System.out.println("enter the width value");
		width=sc.nextInt();
		System.out.println("enter the Height value");	
		height=sc.nextInt();
		System.out.println("width = "+width +'\n'+"height ="+height);
	}
	public void calculatedArea()
	{
		areaOfTriangle=(width * height)/2;
	}
	public void displayDetails()
	{
		System.out.println("Triangle Area is"+ areaOfTriangle);
	}
	
}
