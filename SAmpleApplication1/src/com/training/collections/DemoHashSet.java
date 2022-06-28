package com.training.collections;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hashset = new HashSet();
		hashset.add("Pradeep");
		hashset.add("Deepan");
		hashset.add("Kalyani");
		hashset.add("Selvarajan");
		hashset.add("Pradeep");
		hashset.add(null);
		System.out.println(hashset.size());
		Iterator iter = hashset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
