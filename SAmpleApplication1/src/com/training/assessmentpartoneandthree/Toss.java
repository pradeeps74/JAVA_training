package com.training.assessmentpartoneandthree;
import java.util.Random;
public class Toss {
    public String chanceFunc() {
    	Random r = new Random();
    	int chance=r.nextInt(2);
    	if(chance==1) {
    		return "tails";
    	}
    	else {
    		return "heads";
    	}
    }
}
