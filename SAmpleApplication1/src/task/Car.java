package task;

import java.io.*;
import java.util.*;


public class Car implements Serializable {
	String brandName;
	String carName;
	double carprice;
	Date dateOfManufacturing;
	public  Car(String brandName,	String carName,double carprice,Date dateOfManufacturing) {
		
this.brandName=brandName;
this.carName=carName;
this.carprice=carprice;
this.dateOfManufacturing=dateOfManufacturing;

	
}
	public String displayDetails() {
		return "brandName :"+brandName +"CAr name is :"+carName + "CAr price is "+carprice+"DAte of manufacturing is ::"+dateOfManufacturing;
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date dateOfManufacturing = new Date();
		
			Car obj1 = new Car("Jaguar", "Jaguar xe", 4400000.0, dateOfManufacturing);
			String filename = "Car.txt";
			
			//serialization
			try {
				//saving of object in a file
				FileOutputStream fos =new FileOutputStream(filename);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//method for serialization of object
				oos.writeObject(obj1);
				fos.close();
				oos.close();
				//obj1.displayDetails();
				
				System.out.println("object has been serialization "+"Data before Deserialization");
				FileInputStream fis =new FileInputStream(filename);
				ObjectInputStream ois = new ObjectInputStream(fis);
				//method for Deserialization of object
				Car obj2 = (Car)ois.readObject();
				//obj2.displayDetails();
				System.out.println("object has been DeSerialization "+"Data After Deserialization");
				fis.close();
				ois.close();	
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
