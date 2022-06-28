package com.training.second;
import java.util.*;
import java.util.Scanner;
public class DemoException {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 whole number");
		try {
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		}
		catch(IndexOutOfBoundsException i)
		{
			System.out.println(i.getMessage());
		}
		catch(InputMismatchException i)
		{
			System.out.println("please enter integers only");
		}
		catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());
		}
		finally{
			sc.close();
		}
		System.out.println("program run sucessfully");
	}
}
