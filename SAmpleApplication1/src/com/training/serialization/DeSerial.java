package com.training.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deserialization
		
		String filename = "pradeep.txt";
		try {
			FileInputStream fis =new FileInputStream(filename);
			ObjectInputStream oos = new ObjectInputStream(fis);
			//method for Deserialization of object
			EmployeeDetailsForSerialization obj2 = (EmployeeDetailsForSerialization)oos.readObject();
			fis.close();
			oos.close();
			
			System.out.println("object has been DeSerialization "+"Data After Deserialization");
			printData(obj2);
		}
		catch(IOException ix) {
			System.out.println(ix);
		}
		catch(ClassNotFoundException cfe) {
			System.out.println(cfe);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
	public static void printData(EmployeeDetailsForSerialization  object1) 
	{
		 System.out.println("name is :"+ object1.name);
		 System.out.println("age is :"+ object1.age);
		 System.out.println("phoneno is :"+ object1.phoneNo);
		 System.out.println("x is :"+ object1.x);
		 System.out.println("count is :"+ EmployeeDetailsForSerialization.count);
	 }

}
