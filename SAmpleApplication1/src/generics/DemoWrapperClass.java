package generics;

public class DemoWrapperClass{

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;//num1 is primitive type
		Integer num2 = new Integer(num1);//Boxing,num2 is wrapper type
		int num3=num2;////AutoUnboxing
		System.out.println(num2+" "+num3);
		
		Integer num4=num3;//Autoboxing
		int num6 = num4.intValue();//unboxing
		int num5=num4;//AutoUnBoxing
		System.out.println(num6);
		//System.out.println(num5);

	}

}
