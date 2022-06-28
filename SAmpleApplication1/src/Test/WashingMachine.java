package Test;

public class WashingMachine  extends ElectronicItem{
	String operationType;
	String loadingType;
	String capacity;
	String familySize;
 public WashingMachine()
	{
		operationType="Fully Automatic";
		loadingType="Front Load";
		capacity="8kg";
		familySize="couple";
		
	}
 public WashingMachine(String operationType,String loadingType,String capacity,String familySize)
 {
	this.operationType=operationType;
	this.loadingType=loadingType;
	this.capacity=capacity;
	this.familySize=familySize;
 }
 public WashingMachine(int eitemNo,String name,float price,String operationType,String loadingType,String capacity,String familySize)
 {
	 super(eitemNo,name,price);
	this.operationType=operationType;
	this.loadingType=loadingType;
	this.capacity=capacity;
	this.familySize=familySize;
 }
	public String display()
	{
		return super.display();
	}
	public String display(String operationType,String loadingType,String capacity,String familySize)
	{
		System.out.println(super.display()); 
		this.operationType=operationType;
		this.loadingType=loadingType;
		this.capacity=capacity;
		this.familySize=familySize;
		return  "operationType is:"+operationType+"loadingType is :"+loadingType+"capacity is :"+capacity+"familySize :"+familySize;
	}
	public String display(int eitemNo,String name,float price,String operationType,String loadingType,String capacity,String familySize)
	{
		System.out.println(super.display()); 
		this.operationType=operationType;
		this.loadingType=loadingType;
		this.capacity=capacity;
		this.familySize=familySize;
		return  "operationType is:"+operationType+"loadingType is :"+loadingType+"capacity is :"+capacity+"familySize :"+familySize;
	}

}
