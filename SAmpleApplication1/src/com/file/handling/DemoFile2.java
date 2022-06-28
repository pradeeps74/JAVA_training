package com.file.handling;
import java.io.*;

public class DemoFile2 {
	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("/home/vastpro/family/Learning1/SAmpleApplication1/src/calculator/Bank.java");
		FileWriter fw = new FileWriter("/home/vastpro/family/Learning1/SAmpleApplication1/src/Bank.java");
		int i;
		while((i=fr.read())!=-1) {
			fw.write(i);}
		fr.close();
		fw.close();}
	catch(FileNotFoundException fe) {
		fe.printStackTrace();
	}
	catch(IOException ie) {
		ie.printStackTrace();
	}
		/*BufferedReader br = new BufferedReader(fr);
		String str =null;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}*/
	}
	/*catch(IOException ie) {
		System.out.println(ie.getMessage());
	}*/

}

