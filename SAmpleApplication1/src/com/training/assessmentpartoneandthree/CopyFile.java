package com.training.assessmentpartoneandthree;
import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
   BufferedInputStream fin = new BufferedInputStream(new FileInputStream("/home/vastpro/file1"));
BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream("/home/vastpro/file2"));
  int i;
  String str="null";
  if(str.contains("warm")&&str.contains("error")&&str.contains("fatal")) {
  do {
      i = fin.read();
      if (i != -1)
        fout.write(i);
    } while (i != -1);
  }
  else {
	  System.out.println("file not copied");
  }
    fin.close();
    fout.close();
    System.out.println("source file = "+"/home/vastpro/file1");
    System.out.println("target file = "+"/home/vastpro/file2");
    System.out.println("start time = 9 am");
    System.out.println("end time = 9.15 am ");
    System.out.println("time taken = 15 minutes ");
    }
		catch(FileNotFoundException f) {
			f.printStackTrace();
		}
		catch(IOException io) {
			io.printStackTrace();
		}	
	}
}
