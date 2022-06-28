package com.training.second;
import java.util.Date;
//import com.training.second.*;
import java.util.Scanner;
public class Demo1 extends PermanentEmployee{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String empId;
		String empName;
		Employee empArr[]=new Employee[3];
		//System.out.println("enter 3 employee empid,empname");
		for(int i=0;i<empArr.length;i++) 
		/*for (int i = 0; i < empArr.length; i++) {
			System.out.println("enter empid:");
			empId=sc.next();
			System.out.println("enter empname:");
			empName=sc.next();	
			empArr[i]=new Employee(empId,empName);		
		}*/
		{
			empArr[i]=new Employee();
		}
		for(int i=0;i<empArr.length;i++)
		{
			System.out.println(empArr[i].display());
		}
		for (Employee i : empArr) {
			System.out.println(i.display());
			
		}
	/*
		System.out.println("Hello");
	PermanentEmployee pe =new PermanentEmployee();
	PermanentEmployee pe1 =new PermanentEmployee(12800,2000);
	System.out.println(pe.display());
	System.out.println(pe1.display());
	PermanentEmployee pe2 =new PermanentEmployee(12800,2000,"PRA777","pradeep");
	System.out.println(pe2.display());
	System.out.println(pe2.display(6689));
	
	
	System.out.println("Contractemployee");
	ContractEmployee ce = new ContractEmployee();
	ContractEmployee ce1 = new ContractEmployee("10hrs",9500.87f);
	System.out.println(ce.display());
	System.out.println(ce1.display());
	ContractEmployee ce2= new ContractEmployee("10hrs",9500.87f,"Deep","Deepan");
	System.out.println(ce2.display());
	*/

	Employee emp1=new PermanentEmployee();
	System.out.println(	emp1.display());
	//Date d = new Date();
//	Employee emp2 = new Employee("87", "dsffg", d);
//	System.out.println(	emp2.display());
	//emp1.display(8000);we can't access the not over'riden methods
	/* it will call the PermanentEmployee display over'riden method 
		or otherwise it call the Employee display method
	*/
		/*
	emp1=new ContractEmployee();
	System.out.println(	emp1.display());
	//emp1.display(8000);we can't access the not over'riden methods
	/* it will call the PermanentEmployee display over'riden method 
	or otherwise it call the Employee display method
*/
		/*
	System.out.println(Employee.SIZE);
	*/
	}
}
