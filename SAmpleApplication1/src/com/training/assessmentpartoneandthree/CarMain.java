package com.training.assessmentpartoneandthree;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CarMain {




	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="obj.txt";
	    Car c4=new Car();
        Car c=new Car(123,"innova","10 am");
        System.out.println(c);
        System.out.println();
        Car c1=new Car(123,"innova","10 am");
        Car c2=new Car(120,"toyoto","12 am");
        Car c3=new Car(125,"benz","9 am");
    
        if((c.getModel()).equals(c1.getModel())) {
        	System.out.println("they are equal");
        }
        else {
        	System.out.println("they are not equal");
        }
        System.out.println();
        System.out.println("hashcode value is "+c.hashCode());
        System.out.println("hashcode value is "+c1.hashCode());
        System.out.println(c2.getCarRegNo());
        c2.setModel("aadi");
        System.out.println(c2.getModel());
        System.out.println();
        System.out.println(c3.getModel());
        System.out.println();
       System.out.println(c4.getCounter());
       try {
			FileOutputStream fi=new FileOutputStream(filename);
			ObjectOutputStream oi=new ObjectOutputStream(fi);
			oi.writeObject(c1);
			oi.writeObject(c2);
			oi.writeObject(c3);
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        
	}

}
