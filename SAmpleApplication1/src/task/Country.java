package task;

import java.util.*;
import java.util.Scanner;

public class Country {
	
public static void main(String[] args) {
	//HashMap<String, String> map = new HashMap<String, String>();
//	TreeMap<String, String>map=new TreeMap<String, String>();
//	map.put("Chennai", "aj");
//	map.put("india", "Delhi");
//	map.put("srilanka", "kolumbu");
//	map.put("russia", "Moscow");
//	for (Map.Entry m : map.entrySet()) {
//		System.out.println(m.getKey()+"   "+m.getValue());	
//	}
	
//	for (Map.Entry m : map.entrySet()) {
//		System.out.println(m.getKey()+"   "+m.getValue());	
//	}
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any words");
	String input=sc.next();
	Stack stack=new Stack();
//	
//	for (int i=0 ;i<input.length();i++) {
//		
//		stack.push(input.charAt(i));
//	}
//	for(int j=0;j<input.length();j++) {
//		System.out.print(stack.pop());
//	}
	char[] reverse = input.toCharArray();
	for(int i=0;i<reverse.length;i++) {
		stack.add(reverse[i]);
	}
	
	for(int j=0;j<reverse.length;j++) {
	System.out.print(stack.pop());
}
	
}
}
