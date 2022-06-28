package com.training.assessmentpartoneandthree;
import java.io.*;
public class CopyImage {
	
	public static void main(String args[]) {
	try {
		
		FileInputStream fin = new FileInputStream("/home/vastpro/Pictures/demo/undex.jpeg");
		FileOutputStream fout = new FileOutputStream("/home/vastpro/file2");
		  int i;
	   
		
		  do {
		      i = fin.read();
		      if (i != -1)
		        fout.write(i);
		    } while (i != -1);
		  System.out.println("Time = 5 pm");
		  System.out.println("file name = undex.jpeg");
		  System.out.println("status");
		  System.out.println("file copied");
		  fin.close();
		    fout.close();
	}
	catch(FileNotFoundException f) {
		f.printStackTrace();
	}
	catch(IOException io) {
		io.printStackTrace();
	}	
}
}
