package com.training.collections;

import java.util.Iterator;
import java.util.Vector;

public class DemoVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(7);
		v.add(77);
		v.add(55);
		v.add(0, 5);//zero element
		v.remove(2);//remove 2nd index value 
		
		for (Integer i : v) {
			System.out.println(i);
		}
		Iterator<Integer> iter=v.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
v.clear();
System.out.println(v);
	}
}
