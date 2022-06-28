package com.training.Enum;

public class DemoEnum {
	enum Day{SUNDAY(7),MONDAY(77),TUESDAY(777),WEDNESDAY(7777),THURSDAY(77777),FRIDAY(777777),SATURDAY(777787);
		int i;
		Day(int i)
		{
			this.i=i;
		}
		}
	enum Str{SUNDAY(78),MONDAY(778),TUESDAY(7787),WEDNESDAY(77778),THURSDAY(777877),FRIDAY(7787777),SATURDAY(7787787);
		int j;
		Str(int j)
		{
			this.j=j;
		}
	}
	
	public static void main(String[] args) {
		for (Day d : Day.values()) {
			System.out.println(d);
			
		}
		for (Str s : Str.values()) {
			System.out.println(s);
			
		}
		
		/*System.out.println("Value of SUnday is :"+ Str.valueOf("SUNDAY"));//SUNDAY
		System.out.println("Value of SUnday is :"+ Str.valueOf("SUNDAY").ordinal());//0
		System.out.println("Value of Monday is :"+ Str.valueOf("MONDAY").j);*/
		System.out.println("Value of SUnday is :"+ Day.valueOf("SUNDAY"));//SUNDAY
		System.out.println("Value of SUnday is :"+ Day.valueOf("SUNDAY").ordinal());//0
		System.out.println("Value of Monday is :"+ Day.valueOf("MONDAY").i);
		
		DemoEnum de=new DemoEnum();
		de.toDoList();		
}
	public void toDoList() {
		Day day = Day.FRIDAY;
//Str S=Str.FRIDAY;
switch(day)
	//switch(S)
	{
	case SUNDAY:
		System.out.println("TAKE REST");
		break;
	case MONDAY:
		System.out.println("go office");
		break;
	case TUESDAY:
		System.out.println("Studing");
		break;
	case WEDNESDAY:
		System.out.println("GAming");
		break;
	case THURSDAY:
		System.out.println("Outing");
		break;
	case FRIDAY:
		System.out.println("Do prayer");
		break;
	case SATURDAY:
		System.out.println("go somewhere");
		break;
		default:
			System.out.println("Focus on work");
		
	}
	}
}
