package com.training.second;

import java.util.Scanner;

public class Numbers {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int arr[]=new int[5];
		 int sum=0;
		 int avg;
		 int i,j;
		 int min;
		 int max;
		 int sumAlternate=0;
		
		//Numbers n=new Numbers();
		System.out.println("Enter 10 integers number");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];	
			
		}
		System.out.println("sum is "+" "+sum);
		avg=sum/arr.length;
		System.out.println("Average of sum is "+" "+avg);
		min=arr[0];
		max=arr[0];
		for(j=0;j<arr.length;j++)
		{
		if(arr[j]<avg) {
			System.out.println("number below the average is :"+arr[j]);
		}
		}
		
		for(j=0;j<arr.length;j++) {
			if(arr[j]>avg) {
				System.out.println("number Greater than average is :"+arr[j]);
			}
		}
	for(j=0;j<arr.length;j++)	
			{
		if(arr[j]%2==0)
		{
			System.out.println("even numbers are"+arr[j]);
		}
		if(arr[j]%2!=0) {
			System.out.println("odd numbers are"+arr[j]);
		}
			}
	for(j=0;j<arr.length;j+=2) {
		System.out.println("Alternate numbers is"+arr[j]);
		 sumAlternate=sumAlternate+arr[j];
	}
	System.out.println("sum of Alternate numbers is"+sumAlternate);
		
	for(j=0;j<arr.length;j++)
	{
		if(arr[j]>=0)
		{
			System.out.println("positive number is "+arr[j]);
		}
		else
		{
			System.out.println("Negative number is "+arr[j]);
		}
	}
	for(j=0;j<arr.length;j++) {
		if(min>arr[j]) {
			min=arr[j];	
		}
		
		if(max<arr[j]) {
			max=arr[j];	
			
		}	
	}
	System.out.println("Minimum value is :"+min);
	System.out.println("Maximum value is:"+max);
	sc.close();
	}

}
