package Test;

public class DemoElectronicItem extends Refrigrator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicItem ei=new ElectronicItem();
		System.out.println(ei.display());
		System.out.println(ei.display(32, "grinder", 3999.99f));
		ElectronicItem ei1=new ElectronicItem(55,"mixie",4500.0f);
		System.out.println(ei1.display());
		System.out.println(ei1.display(77,"ps4",8000.75f));
		
		Refrigrator re = new Refrigrator();
		System.out.println(re.display());
		System.out.println(re.display(10, 4, "FAmily of 3", "Semi automatic"));
		System.out.println(re.display(66, "Samsung 198", 17900.58f, 8, 4, "couple", "manual"));
		
		Refrigrator re1 = new Refrigrator(16, 4, "FAmily of 2", "Semi automatic");
		System.out.println(re1.display());
		Refrigrator re2 = new Refrigrator(55, "Samsung 178", 27900.58f, 10, 5, "family of 4", "fully automatic");
		System.out.println(re2.display());
	}

}
