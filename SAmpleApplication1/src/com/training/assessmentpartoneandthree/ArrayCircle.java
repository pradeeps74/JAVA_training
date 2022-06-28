package com.training.assessmentpartoneandthree;

public class ArrayCircle {
	 public static double getArea(double radius) {
		  radius=Math.random();
		 double pai=3.14;
  	   double area=pai*radius*radius;
  	   return area;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		double sum=0.0;
       int cirArray[]= new int[100];
       int n=cirArray.length;
		for(int i=1;i<n;i++) {
		
			sum= sum+ getArea(cirArray[i]);
		}
       System.out.println("sum of areas of circles ="+sum); 
	}

}
