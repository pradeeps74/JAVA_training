package com.practice.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
	public static Connection getPostgresqlConnection() {
		Connection connection=null;
		ResourceBundle labels=ResourceBundle.getBundle("application");
		try {
			String url=labels.getString("datasource.postgres.url");
			String userName=labels.getString("datasource.postgres.userName");
			String password=labels.getString("datasource.postgres.password");
			String driverClass=labels.getString("datasource.postgres.driverclass");
			
			Class.forName(driverClass);
			connection=DriverManager.getConnection(url,userName,password);
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		return connection;
		
	}

}
