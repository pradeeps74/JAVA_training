package com.training.collections;

import com.training.second.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList myList = new ArrayList();
//		myList.add(777);// AutoBoxing
//		myList.add("pradeep");
//		myList.add(8056l);
		/*
		 * for (Object o : myList) { System.out.println(o);
		 * 
		 * }
		 */
		/*
		 * Iterator iter = myList.iterator(); while (iter.hasNext()) {
		 * System.out.println(iter.next());
		 * 
		 * }
		 */
		ArrayList<String> myList1 = new ArrayList<String>();
		myList1.add("Kalyani");
		myList1.add("pradeep");
		myList1.add("Deepan");
Collections.sort(myList1);
		for (String s : myList1) {

			if (s.contains("e")) {
				System.out.println(s);
		}

		}

//		Iterator iter1 = myList1.iterator();
//		{
//			while (iter1.hasNext()) {
//
//				System.out.println(iter1.next());
//			}
//		}
//myList.clear();
myList1.clear();
//		ArrayList<Student> arr1 = new ArrayList<Student>();
//		Student st = new Student("Pradeep", "chennai", 8870877562l, 77, "Bachelor of arts",
//				"Criminology and police administration", 97.04f, "DGVC,Arumbakkam,chennai");
//		arr1.add(st);
//
//		for (Student s : arr1) {
//			System.out.println(s.display());
////			
////			System.out.println(s.rollNumber);
//	//System.out.println(s);
//			System.out.println(s.hashCode());
//			System.out.println(s.equals(st));

		}
//		Iterator iter = arr1.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		arr1.clear();
		
//		ArrayList<String>arr2=new ArrayList<String>();
//		arr2.add("Love");
//		arr2.add("Peace");
//		arr2.add("Travel");
//		
//		arr2.forEach(name->{
//			
//			if(name.contains("l")) {
//				System.out.println(name);
//			}
//		});	
	//}
}
