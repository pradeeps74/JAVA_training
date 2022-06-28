package com.training.assessmentpartoneandthree;

public class Square {
	int length;
    int breath;
    public Square() {
  	  length=80;
  	  breath=100;
    }
    public double area;
     public double getArea() {
    	  area=length*breath;
  	   return area;
     }
     public void printInfo() {
  	   System.out.println("area = "+area);
     }
}
