package com.training.assessmentpartoneandthree;

public class Rectangle  extends Shape{
      int length;
      int breath;
      public Rectangle() {
    	  length=80;
    	  breath=1000;
      }
      public double getArea() {
     	   area=length*breath;
     	   return area;
       }
       public void printInfo() {
       	super.printInfo();
     	  System.out.println("length of rectangle = "+length);
          System.out.println("breath of rectangle = "+breath);

       }
}
