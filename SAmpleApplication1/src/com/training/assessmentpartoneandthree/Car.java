package com.training.assessmentpartoneandthree;

import java.io.Serializable;

public class Car implements Serializable{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int carRegNumber;
     String model;
     String createdTime;
    static int count;
     //default constructor
     public Car() {
    	 carRegNumber=140;
    	 model="maruthi";
    	 createdTime="8 am";
        count++;
         }
     // parameterized constructor
     public Car(int carRegNo,String modl,String time) {
    	 carRegNumber=carRegNo;
    	 model=modl;
    	 createdTime= time;
    	 count++;
     }
     //toString method
     public String toString(){//overriding the toString() method  
    	  return carRegNumber+" "+model+" "+createdTime;  
    	 } 
     //getters and setters
     public int getCarRegNo() {
    	 return carRegNumber;
     }
     public void setCarRegNo (int carRegNumber)  
     {  
       this.carRegNumber = carRegNumber;  
     } 
     public String getModel() {
    	 return model;
     }
     public void setModel (String model)  
     {  
       this.model = model;  
     } 
     public String getCreatedTime() {
    	 return createdTime;
     }
     public void setCreatedTime (String createdTime)  
     {  
       this.createdTime = createdTime;  
     } 
     public int getCounter() {
       return count;
     }
   
}
