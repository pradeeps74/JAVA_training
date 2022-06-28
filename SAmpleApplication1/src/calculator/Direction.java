package calculator;
import java.util.Scanner;

public class Direction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id;
		String title;
		String duration;
		String hero;
		String villan;
		Scanner sc = new Scanner(System.in);
		Movies m=new Movies();
		m.display();
		Movies m1 =new Movies("DeathNote01","Death Note","05:45:55","L","Light Yagami");
		m1.display();
		
		System.out.println("Enter movieid");
		id=sc.next();
		System.out.println("Enter moviename");
		title=sc.next()	;
		System.out.println("enter durationtime");
		duration=sc.next();
		System.out.println("Enter Hero name");
		hero=sc.next();
		System.out.println("Enter villain name");
		villan=sc.next();
		sc.close();
		Movies m2=new Movies();
		m2.accept(id, title, duration, hero, villan);
	m2.total();
	}

}
