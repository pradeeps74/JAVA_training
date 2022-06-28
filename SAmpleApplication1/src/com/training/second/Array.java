package com.training.second;
import java.util.Scanner;
public class Array { 
	public static void main(String[] args)
	{
		/*int arr[]= {10,20,30,40,50};
	for(int i=0;i<5;i++)
	{
		System.out.println(arr[i]);
	}*/
		
	Scanner sc =new Scanner(System.in);
	int ar[]=new int[5];
	int j;
	System.out.println("enter 5 numbers");
	for(j=0;j<=4;j++)
	{
		ar[j]=sc.nextInt();
		//System.out.println(ar[j]);
	}
	/*for(int z=0;z<=4;z++) {
		System.out.println(ar[z]);
	}*/
	for (int i : ar)
	{
		System.out.println(i);
	}
	
	}
}
