package com.training.second;

import java.util.Scanner;

public class Demo2 extends Book{
	public static void main(String[]args)
	{
		String title;
		float price;
		int pageCount;
		int playingTime;
		Scanner sc= new Scanner(System.in);
		Publication pubArr[]=new Publication[1];
		Publication pubArr1[]=new Book[1];
		Publication pubArr2[]=new Dvd[1];
		for(int i=0;i<pubArr.length;i++)
		{
			System.out.println("enter titleof book ");
			title=sc.next();
			System.out.println("enter price of book ");
			price=sc.nextFloat();
			System.out.println("enter pagecount number");
			pageCount=sc.nextInt();
			System.out.println("enter playingtime number");
			playingTime=sc.nextInt();
			
			pubArr[i]=new Publication(title,price) ;
			pubArr1[i]=new Book(pageCount,title,price);
			pubArr2[i]=new Dvd(playingTime,title,price);
			
		}
		
		for(int i=0;i<1;i++)
		{
			System.out.println(pubArr[i].display());
			System.out.println(pubArr1[i].display());
			System.out.println(pubArr2[i].display());
		}
		sc.close();
}
}
