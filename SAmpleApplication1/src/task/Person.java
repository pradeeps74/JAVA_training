package task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try {

			int age=s.nextInt();
			String name=s.next();
			FileWriter fw = new FileWriter("/home/vastpro/family/Learning1/SAmpleApplication1/Person/person.txt");
			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write("My name"+name);
//			bw.write("My Age"+age);
			bw.write(age+name);
			//bw.write(age+age);
			
			bw.close();
			//fw.close();
			FileReader fr = new FileReader("/home/vastpro/family/Learning1/SAmpleApplication1/Person/person.txt");
			BufferedReader br = new BufferedReader(fr);
		String str = null;
		while((str=br.readLine())!=null) {
			System.out.println(str);
			System.out.println("name is saved to ");
		}	
		br.close();
		fr.close();
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
