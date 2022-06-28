package Test;

public class Refrigrator extends ElectronicItem{
	int draws;
	int efficiency;
	String capacity;
	String temperatureControls;
	public Refrigrator()
	{

		draws=4;
		efficiency=5;
		capacity="single";
		temperatureControls="Automatic";
		
	}
	public Refrigrator(int draws,int efficiency,String capacity,String temperatureControls)
	{
		this.draws=draws;
		this.efficiency=efficiency;
		this.capacity=capacity;
		this.temperatureControls=temperatureControls;
	}
	public Refrigrator(int eitemNo,String name,float price,int draws,int efficiency,String capacity,String temperatureControls)
	{
		super(eitemNo,name,price);
		this.draws=draws;
		this.efficiency=efficiency;
		this.capacity=capacity;
		this.temperatureControls=temperatureControls;
	}
	
	public String display()
	{
		return super.display();
	}
	public String display(int draws,int efficiency,String capacity,String temperatureControls)
	{
		System.out.println(super.display());
		this.draws=draws;
		this.efficiency=efficiency;
		this.capacity=capacity;
		this.temperatureControls=temperatureControls; 
		return  "draws no :"+draws+"efficiency is :"+efficiency+"capacity is :"+capacity+"temperatue controls is"+temperatureControls;
	}
	public String display(int eitemNo,String name,float price,int draws,int efficiency,String capacity,String temperatureControls)
	{
		System.out.println(super.display());
		this.draws=draws;
		this.efficiency=efficiency;
		this.capacity=capacity;
		this.temperatureControls=temperatureControls; 
		return  "draws no :"+draws+"efficiency is :"+efficiency+"capacity is :"+capacity+"temperatue controls is"+temperatureControls;
	}

}
