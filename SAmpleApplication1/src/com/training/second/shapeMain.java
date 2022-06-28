package com.training.second;
import java.util.Scanner;
public class shapeMain extends Circle{

	public static void main(String[] args) {
		
		Triangle obj = new Triangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Triangle ");
		obj.getDetails(sc);
		obj.calculatedArea();
		obj.displayDetails();
		System.out.println("Circle");
		Circle obj1= new Circle();
		obj1.getDetails(sc);
		obj1.calculatedArea();
		obj1.displayDetails();
		sc.close();
	

	}

}
