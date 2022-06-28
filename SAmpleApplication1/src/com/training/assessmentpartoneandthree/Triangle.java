package com.training.assessmentpartoneandthree;

public class Triangle extends Shape{
    int base;
    int height;
    public Triangle() {
  	  base=65;
  	  height=44;
    }
    public double getArea() {
   	   area= ((1/2)*base*height);
   	   return area;
     }
     public void printInfo() {
    	System.out.println(area);
   	  System.out.println("base of triangle = "+base);
        System.out.println("height of rectangle = "+height);

     }
}
