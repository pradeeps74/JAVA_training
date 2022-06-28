package com.training.second;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayListMain {
	public static void main(String[] args) {
		ArrayList<Student> arr1 = new ArrayList<Student>();
		Student st = new Student();
		arr1.add(st);

		for (Student s : arr1) {
			System.out.println(s.display());
			
			System.out.println(s.rollNumber);
			System.out.println(s.toString());
			
		}
		Iterator iter = arr1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		arr1.clear();
	}

}
