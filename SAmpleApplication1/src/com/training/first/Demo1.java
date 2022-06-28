package com.training.first;
import java.util.Date;

import com.training.second.*;
public class Demo1 {
	public static void main(String[] args)
	{
		//Demo2 obj = new Demo2();
		//DemoProtected obj2=new DemoProtected();
		//obj2.Demo();
		Employee e1 = new Employee();
	System.out.println(	e1.display());
	Date d = new Date();
	Employee e2 = new Employee("888","Deepan",d);
	System.out.println(	e2.display());
	Employee.displayCount();
		//e1.displayCount();
	}

}
