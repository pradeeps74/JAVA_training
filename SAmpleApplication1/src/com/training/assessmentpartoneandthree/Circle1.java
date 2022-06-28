package com.training.assessmentpartoneandthree;

public class Circle1 extends Shape{
	int radius;
    double pai= 3.14;
  
    public Circle1() {

  	  radius=80;
    }
    public double getArea() {
  	   area=pai*radius*radius;
  	   return area;
    }
    public void printInfo() {
    	super.printInfo();
  	  System.out.println("radius of circle ="+radius);
 

    }
}
