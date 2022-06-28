package com.training.assessmentpartoneandthree;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File folder=new File("/home/vastpro/sam.txt");
      if(!folder.exists()) {
    	  folder.mkdir();
      }
      System.out.println("new file created");
      FileWriter fw=new FileWriter("/home/vastpro/sample.txt");
      BufferedWriter bw=new BufferedWriter(fw);
      bw.write("there was a warm climate");
      bw.write("it was a fatal error");
      bw.write("climate was cold");
      bw.write("he took hot coffee");
      bw.write("he took col coffee also");
      bw.close();
      fw.close();
      System.out.println("data saved");
	}
  catch(IOException e) {
	  System.out.println(e.getMessage());
  }
	}
}
