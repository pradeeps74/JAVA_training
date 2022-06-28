package com.training.second;

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
	
		
		
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("enter number to print prime numbers");
		int num=s.nextInt();
		
		for(int j=1;j<=num;j++)
		{
			
			for(int i=1;i<=j;i++) {
			if(j%i==0)
			{
				count++;
			}
			}
		if(count==2) 
			System.out.println(j+"is a prime");
		count=0;

		}s.close();
	}
}
