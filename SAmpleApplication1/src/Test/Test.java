package Test;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer number");
		int num1=sc.nextInt();
		System.out.println("enter an integer number");
		int num2=sc.nextInt();
		sc.close();
		for(int i=num1;i<num2 ;i++)
		{
			
				if(i%2==0)
				{
					
					//System.out.println(i);
					System.out.println(i);
					
				}
	
		}
	
	}
}

