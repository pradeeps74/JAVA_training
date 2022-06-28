package com.training.second;
import java.util.Scanner;
public class DemoInterface extends Hospital {
	public static void main(String[] args) {
		String hospitalName;
		String hospitalAddress;
		String phoneNumber;
		int billNumber;
		double counsultationFee;
		Hospital b = new Hospital();
		b.display();
		System.out.println(b.display("love", "k.k.nagar,chennai-600078", "568900777", 85, 3100.2));
		System.out.println(b.getDetails());
		System.out.println(b.calculateBill());
		System.out.println(b.displayBillDetails());
		/*Billable b1 =new Hospital();
		b1.getDetails();
		b1.calculateBill();
		b1.displayBillDetails();*/
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Hospital name");
		hospitalName=sc.next();
		System.out.println("enter Hospital Address");
		hospitalAddress=sc.next();
		System.out.println("enter hospital mobile no");
phoneNumber=sc.next();
System.out.println("enter bill  no");
billNumber=sc.nextInt();
System.out.println("enter consultation fee price amount");
counsultationFee=sc.nextDouble();
		System.out.println(b.display(hospitalName,hospitalAddress,phoneNumber,billNumber,counsultationFee));
		sc.close();
		Hospital h1 =new Hospital("deepan","dam","8870877562",87,8756.65);
		h1.display();
		h1.show();
		Billable.greeting();	
	}

}
