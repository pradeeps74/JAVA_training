package com.training.exception;

public class DemoExceptionMain {
	public static void main(String[] args) {
		try {
		Recruitment r =new Recruitment();
		r.recruit();
		Recruitment r1 =new Recruitment(77);
		r1.recruit();
		}
		catch(InvalidAgeException ie)
		{
			System.out.println(ie.ShowMessage());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
