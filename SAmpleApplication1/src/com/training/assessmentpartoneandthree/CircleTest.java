package com.training.assessmentpartoneandthree;

public class CircleTest {
	int radius;
    double pai= 3.14;
    double area;
    public CircleTest() {

  	  radius=20;
    }
    public void circle1(){
    	radius=30;
    	area=pai*radius*radius;
    	System.out.println("radius of circle ="+radius);
    	  System.out.println("area of circle ="+area);
    	
    }
    public void circle2(){
    	radius=50;
    	area=pai*radius*radius;
    	System.out.println("radius of circle ="+radius);
    	  System.out.println("area of circle ="+area);
    	
    }
    public void circle3(){
    	radius=60;
    	area=pai*radius*radius;
    	System.out.println("radius of circle ="+radius);
    	  System.out.println("area of circle ="+area);
    	
    }
    public double getArea() {
  	   area=pai*radius*radius;
  	   return area;
    }
    public void printInfo() {
  	  System.out.println("radius of circle ="+radius);
  	  System.out.println("area of circle ="+area);

    }
}
