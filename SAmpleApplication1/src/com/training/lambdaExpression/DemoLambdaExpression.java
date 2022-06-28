package com.training.lambdaExpression;

 interface GreetingsBye {
	 void sayBye();
	 }
 interface GreetingsHi{
	 String sayHi(String str);
 }
  class DemoLambdaExpression{
	 public static void main(String[] args) {
		 GreetingsBye Str=()->{
			 System.out.println("Bye");
		 };
		 Str.sayBye();
		 
		 GreetingsHi a=(Name)->{
			 return "hi"+" "+Name;
		 };
		 System.out.println(a.sayHi("Pradeep"));
	 }
		
	}
 
