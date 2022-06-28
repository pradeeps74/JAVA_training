package com.training.assessmentpartoneandthree;

public class Shape implements ShapeBehaviours{
     
       public double area;
       public double getArea() {
    	   return area;
       }
       public void printInfo() {
    	   System.out.println("area = "+area);
       }
}
