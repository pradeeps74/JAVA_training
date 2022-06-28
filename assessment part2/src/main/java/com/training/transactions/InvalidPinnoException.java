package com.training.transactions ;
public class InvalidPinnoException extends Exception{
    /**
* 
*/
private static final long serialVersionUID = 1L;
	int pinno;
    public InvalidPinnoException(int pinno) {
		this.pinno=pinno;
	}
	public String showMessage() {
		return "Invalid Pin Number";
		
	}



}
