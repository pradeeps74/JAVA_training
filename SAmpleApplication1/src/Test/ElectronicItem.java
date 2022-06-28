package Test;

public class ElectronicItem {
	int eitemNo;
	String name;
	float price;
	public ElectronicItem() {
		eitemNo=888;
		name="Trimmer";
		price=1500.87f;
	}
	public ElectronicItem(int eitemNo,String name,float price)
	{
		this.eitemNo=eitemNo;
		this.name=name;
		this.price=price;
	}
	public String display()
	{
		return "item no :"+eitemNo+"name is :"+name+"price is :"+price;
	}
	public String display(int eitemNo,String name,float price)
	{
		return "item no :"+eitemNo+"name is :"+name+"price is :"+price;
	}
	
}
