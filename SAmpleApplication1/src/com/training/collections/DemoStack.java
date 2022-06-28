package com.training.collections;

import java.util.Iterator;
import java.util.Stack;

public class DemoStack {
public static void main(String[] args) {
	Stack s = new Stack();
	s.push("pradeep");
	s.push("Deepan");
	s.push("Kalyani");
	s.push("Selvarajan");
	
	Iterator iter = s.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	System.out.println("which object is in first  "+s.peek());
	System.out.println("Which object is removed  "+s.pop());
	s.clear();
	System.out.println(s);
	
	
}
}
