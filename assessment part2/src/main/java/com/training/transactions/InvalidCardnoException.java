package com.training.transactions;

public class InvalidCardnoException extends Exception{
         /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		 long cardno;
         public InvalidCardnoException(long cardno) {
     		this.cardno=cardno;
     	}
     	public String showMessage() {
     		return "Invalid Card Number";
     		
     	}
}

