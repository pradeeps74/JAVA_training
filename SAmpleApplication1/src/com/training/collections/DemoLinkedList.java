package com.training.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add("Second");
		list.addFirst("First");
		list.addLast("Third");
		for (Object o : list) {
			System.out.println(o);
		}

		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Peace");
		list1.addFirst("Love");
		list1.addLast("Travel");
		for (String s : list1) {
			if (s.contains("o"))
				System.out.println(s);
		}
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("silence");
		list2.add("lonely");
		list1.addAll(list2);// how to addall
		System.out.println(list1);
		list1.removeAll(list2);
		System.out.println(list1);
		list1.removeAll(list2);
		System.out.println(list1);
		list1.removeFirst();
		System.out.println(list1);
		list1.removeLast();
		System.out.println(list1);
	}

}
