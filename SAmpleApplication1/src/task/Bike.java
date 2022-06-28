package task;

import com.training.exception.*;
import java.io.*;
import java.util.*;

public class Bike {
	String brandName;
	String bikeName;
	double bikePrice;
	double showRoomPrice = 42599.78;
	Date dateOfManufacturing;

	public Bike(String brandName, String bikeName, double bikePrice, Date dateOfManufacturing) {
		
		this.brandName = brandName;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
		this.dateOfManufacturing = dateOfManufacturing;
	}

	public String bikeDetails() throws BikePriceException {
		if (bikePrice < 0 || bikePrice < showRoomPrice) {
			throw new BikePriceException(bikePrice);
		} else {
			return "Bike [brandName=" + brandName + ", biKeName=" + bikeName + ", bikeprice=" + bikePrice
					+ ", dateOfManufacturing=" + dateOfManufacturing + "]";
		}
	}

	public static void main(String[] args) {
		Date dateOfManufacturing = new Date();
		Bike b = new Bike("yamaha", "Rx100", 41599.78, dateOfManufacturing);

		try {
			b.bikeDetails();
//			String fileName="Bike.txt";
//			FileOutputStream fos= new FileOutputStream(fileName);
//			ObjectOutputStream oos =new ObjectOutputStream(fos);
//			oos.writeObject(b);
//			oos.close();
//			fos.close();
//			FileInputStream fis = new FileInputStream(fileName);
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			Bike b1=(Bike)ois.readObject();
//			b1.bikeDetails();
//			fis.close();
//			ois.close();

		} catch (BikePriceException be) {
			System.out.println(be.ShowMessage());
		}
//		catch(IOException io) {
//			System.out.println(io.getMessage());
//		}
		catch (Exception fe) {
			System.out.println(fe.getMessage());
		}

	}

}
