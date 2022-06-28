package com.training.collections;
import java.util.*;
public class DemoDate {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		@SuppressWarnings("deprecation")
		Date d2=new Date(1999,3,07);
		System.out.println(d2);
		Date d3=new Date(2022,4,07,7,7,7);
		System.out.println(d3);
		System.out.println(d2.after(d1));
		System.out.println(d3.after(d2)); 
		System.out.println(d1.getDate());
		System.out.println(d1.getDay());
		System.out.println(d1.getMonth());
		System.out.println(d1.compareTo(d3));
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getFirstDayOfWeek());
		calendar.add(calendar.YEAR, 1);
		System.out.println(calendar.get(calendar.YEAR));
		System.out.println(calendar.getTimeZone());
		
	}

}
