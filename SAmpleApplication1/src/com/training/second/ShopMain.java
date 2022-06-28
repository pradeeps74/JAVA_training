package com.training.second;

import java.util.Scanner;

public class ShopMain extends Shop {
	public static void main(String[] args) {
		int billNumber;
		String product;
		double total;
		Shop s = new Shop();
		s.display();
		
		System.out.println(s.getDetails());
		System.out.println(s.calculateBill());
		System.out.println(s.displayBillDetails());
		Scanner sc =new Scanner(System.in);		
System.out.println("enter bill  no");
billNumber=sc.nextInt();
System.out.println("enter product  name");
product=sc.next();
System.out.println("enter total   amount");
total=sc.nextDouble();
		System.out.println(s.display(shopName,shopAddress,phoneNumber,billNumber,product,total));
		System.out.println(s.display("myntra", "hyderabad", "36987", billNumber, product, total));
		s.show();
		Billable.greeting();
		sc.close();
	
	}

}
