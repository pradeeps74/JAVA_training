package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static final String  DB_DRIVER_NAME="org.postgresql.Driver";
	private static final String  DB_DRIVER_URL="jdbc:postgresql://localhost:5432/vastpro";
	private static final String  DB_DRIVER_USER="postgres";
	private static final String  DB_DRIVER_PASSWORD="postgres";
	
	public static Connection getConnection() throws SQLException {
		Connection connection =null;
		try {
			Class.forName(DB_DRIVER_NAME);
			System.out.println("Successfully connected");
		}
		catch(Exception e) {
			System.out.println("not connection to database");
		}
		connection=DriverManager.getConnection(DB_DRIVER_URL,DB_DRIVER_USER,DB_DRIVER_PASSWORD);
		return connection;
		
	}

}
