package com.training.assessmentpartoneandthree;

import java.io.FileInputStream;

import java.io.ObjectInputStream;


public class Carmain1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="obj.txt";
		try {
			FileInputStream fi=new FileInputStream(filename);
			ObjectInputStream oi=new ObjectInputStream(fi);
			Car c1=(Car)oi.readObject();
			Car c2=(Car)oi.readObject();
			Car c3=(Car)oi.readObject();
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
      
	}

}
