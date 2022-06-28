package com.training.assessmentpartoneandthree;
import java.util.Scanner;
public class FlipCoinCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int no=sc.nextInt();
        Toss t1=new Toss();
        int tails=0;
        int heads=0;
        for(int i=1;i<=no;i++) {
      	  if(t1.chanceFunc().equals("tails")) {
      		  tails++;
      	  }
      	  else {
      		  heads++;
      	  }
        }
        System.out.println("heads = "+heads);
        System.out.println("tails = "+tails);
        sc.close();
	}

}
