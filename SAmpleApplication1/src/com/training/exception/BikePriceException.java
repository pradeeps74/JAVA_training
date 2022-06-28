package com.training.exception;

public class BikePriceException extends Exception{
	 private double bikePrice;

	public BikePriceException(double bikePrice) {
		this.bikePrice = bikePrice;
	}
	public String ShowMessage() {
		return "Invalid price :   "+bikePrice;
	}
	 
}