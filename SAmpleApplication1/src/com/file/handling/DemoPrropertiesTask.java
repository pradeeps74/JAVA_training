package com.file.handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class DemoPrropertiesTask {
public static void main(String[] args) {
	Properties p=new Properties();
	p.setProperty("User-name", "Vastpro");
	p.setProperty("Password", "vastpro123");
	FileReader reader;
	try {
		p.store(new FileWriter("db.database"), "Database properties");
		reader=new FileReader("db.database");
		p.load(reader);
		String username=p.getProperty("User-name");
		String password=p.getProperty("Password");
		if(username.equals("Vastpro")&&password.equals("vastpro123")) {
			System.out.println("Welcome to vastpro");
		}
		else {
			System.out.println("Invalid username or password");
		}
	}
	catch(IOException ie) {
		ie.printStackTrace();
	}
//	System.out.println(p.getProperty("User-name"));
//	System.out.println(p.getProperty("Password"));
}
}
