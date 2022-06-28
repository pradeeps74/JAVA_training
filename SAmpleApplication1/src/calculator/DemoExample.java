package calculator;

public class DemoExample {
	public static void main(String[] args)
	{
		//int sum1;
		Calculator obj = new Calculator();
		int sum = obj.add(77, 66);
		int sub = obj.subtract(56,44);
		System.out.println(	obj.add(10,7));
		System.out.println(	obj.add(10,7,77));
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(	obj.subtract(10,7));
		System.out.println(	obj.subtract(10,7,2));
		//Calculator obj1 = new Calculator();
		//System.out.println(obj1.subtract(88,77));
	}

}
