package com.training.second;
import java.util.Scanner;
public class Name {
	int arr[]=new int[5];
	String word="";
	public  void array(Scanner sc)
	{
		System.out.println("enter Five integer number");
	
	for (int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	if(arr[0]==arr[4]) {
		System.out.println("first"+arr[0] +"and last"+arr[4]+"element of array integer are same");
	}
	else
	{
		System.out.println("first and last element of array integer are not same");
	}
}
	//String instruments[]= {"piano","guitor","flute","Drums"};
	//public void instruments()
	public void instruments(Scanner sc)
	{
		System.out.println("Enter 4 instruments name");
		String instruments[]=new String[4];
		int i;
		for( i=0;i<instruments.length;i++)
		{
			instruments[i]=sc.next();
		}
		for( i=0;i<instruments.length;i++)
		{
		char a[]=instruments[i].toCharArray();
		for(int j=0;j<a.length;j++)		
		{
			if(a[j]!='a' && a[j]!='e'&& a[j]!='i'&& a[j]!='o'&& a[j]!='u')
			{
				word+=a[j];
			}
		}System.out.println(word);
		word="";
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		System.out.println("welcome"+" "+name+" "+"to the World of JAVA");
		Name n= new Name();
		n.array(sc);
		n.instruments(sc);
;		sc.close();
		
	}
}

