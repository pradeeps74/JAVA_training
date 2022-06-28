package Test;

import java.util.Scanner;

public class ArrayPractice {
	static int  arr[]= new int[5];
	static int total;
	static int product=1;
	static int smallestNum=0;
	
	public static void total(Scanner sc)
	{
		for(int j=0;j<arr.length;j++)
		{
			total= total +arr[j] ;
		}
		System.out.println(total);
	}
	public static void product(Scanner sc)
	{
		for(int j=0;j<arr.length;j++)
		{
			product= product *arr[j] ;
		}
		System.out.println(product);
	}
	
	public static void smallestNumber() {
		for(int j=0;j<arr.length;j++)
		{if(arr[j]>smallestNum)
		{
			smallestNum = arr[j] ;
		}
		}
		System.out.println(smallestNum);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 Integer Number");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			smallestNum=arr[0];
		}
		System.out.println("Enter one  Number");
		ArrayPractice.total(sc);
		ArrayPractice.product(sc);
		ArrayPractice.smallestNumber();
		
	}
}
