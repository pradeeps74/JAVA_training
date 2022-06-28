package com.training.second;
import java.util.Scanner;
public class Circle {
int radius;
double pi =3.14;
double radiusValue;
void getDetails(Scanner sc)
{
	System.out.println("enter the radius value");
	radius=sc.nextInt();
	System.out.println("radius = " + radius);

}
void calculatedArea()
{
	radiusValue=(pi*radius*radius);
}
void displayDetails()
{
	System.out.println("circle area is "+" "+radiusValue);
}
}
