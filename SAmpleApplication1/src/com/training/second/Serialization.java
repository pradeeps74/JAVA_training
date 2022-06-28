package com.training.second;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.training.serialization.EmployeeDetailsForSerialization;

public class Serialization {
	public static void main(String[] args) {
		Student studobj1=new Student();
		try {
		FileOutputStream fos = new FileOutputStream
				("/home/vastpro/family/Learning1/SAmpleApplication1/src/com/training/second/Student.java");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(studobj1);
		
		fos.close();
		oos.close();
		
		System.out.println("object has been serialization "+"Data before Deserialization");
		System.out.println(studobj1.display());

		}
	
		catch(FileNotFoundException fe) {
			System.out.println("FilenotfoundException is caught");
		}
		
		catch(IOException ie) {
			System.out.println("IoException is caught");
			ie.printStackTrace();
		}
		
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
		
		try {
			FileInputStream fis =new FileInputStream("/home/vastpro/family/Learning1/SAmpleApplication1/src/com/training/second/Student.java");
			ObjectInputStream oos = new ObjectInputStream(fis);
			//method for Deserialization of object
		Student obj2 = (Student)oos.readObject();
			fis.close();
			oos.close();
			
			System.out.println("object has been DeSerialization "+"Data After Deserialization");
			System.out.println(obj2.display());
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
	}


