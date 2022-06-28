package com.training.assessmentpartoneandthree;

public class Circle {
      int radius;
      double pai= 3.14;
      double area;
      public Circle() {

    	  radius=40;
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
