package com.training.test1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	 public static Connection getConnection() throws Exception {
   	  Connection conn=null;
   	  try {
   		   Class.forName("org.postgresql.Driver");
   	  }
   	  catch(Exception e) {
   		  e.printStackTrace();
   	  }
   	  conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
   	  return conn;
   }
}
