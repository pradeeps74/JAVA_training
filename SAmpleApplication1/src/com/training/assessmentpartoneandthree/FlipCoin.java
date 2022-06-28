package com.training.assessmentpartoneandthree;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Toss t=new Toss();
      int heads=0;
      int tails=0;
      int chances=10;
   
      for(int i=1;i<=chances;i++) {
    	  if(t.chanceFunc().equals("tails")) {
    		  tails++;
    	  }
    	  else {
    		  heads++;
    	  }
      }
      System.out.println("chances = "+chances);
      System.out.println("heads = "+heads);
      System.out.println("tails = "+tails);
	}

}
