package com.training.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class DemoProprties2 {

	public static void main(String[] args) {
		Properties p =new Properties();
		p.setProperty("User-name", "pradeep");
		p.setProperty("Password", "9791");
//		try {
//			p.store(new FileWriter("db.properties"), "Database properties");
//		}
//		catch(IOException io) {
//			io.printStackTrace();
//		}
		FileReader reader;
		try {
			
			reader=new FileReader("db.properties");
			p.load(reader);
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		System.out.println(p.getProperty("User-name"));
		System.out.println(p.getProperty("Password"));
		
}
}
