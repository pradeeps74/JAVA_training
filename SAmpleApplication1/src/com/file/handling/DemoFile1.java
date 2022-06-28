package com.file.handling;
import java.io.*;
public class DemoFile1 {

	public static void main(String[] args) {
		  
		try {
			File folder =new File("Demo");
			if(!folder.exists())
			{
				folder.mkdir();
			}
			FileWriter  fw = new FileWriter("Demo/peace.txt");
		
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Live a peaceful life");
			
			bw.close();
			System.out.println("Data saved");
			FileReader fr = new FileReader("Demo/peace.txt");
			BufferedReader br = new BufferedReader(fr);
		
			String str=null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException io)
		{
			System.out.println(io.getMessage());
		}
	}
}
