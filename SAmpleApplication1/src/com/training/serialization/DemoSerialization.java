package com.training.serialization;
import java.io.*;

public class DemoSerialization
{
public static void printData(EmployeeDetailsForSerialization  object1) 
{
	 System.out.println("name is :"+ object1.name);
	 System.out.println("age is :"+ object1.age);
	 System.out.println("phoneno is :"+ object1.phoneNo);
	 System.out.println("x is :"+ object1.x);
	 System.out.println("count is :"+ object1.count);
 }
 public static void main(String[] args) {
	EmployeeDetailsForSerialization obj1 = new EmployeeDetailsForSerialization("pradeep", 23, 9791280195l, 2, 777);
	String filename = "pradeep.txt";
	
	//serialization
	try {
		//saving of object in a file
		FileOutputStream fos =new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//method for serialization of object
		oos.writeObject(obj1);
		fos.close();
		oos.close();
		
		System.out.println("object has been serialization "+"Data before Deserialization");
		printData(obj1);
		//value of static variable chANGED
		//empobj1.count=2000;
		
	}
	catch(IOException io) {
		System.out.println("IoException is caught");
		io.printStackTrace();
	}
	//empObj1=null;
	
	

}
}
