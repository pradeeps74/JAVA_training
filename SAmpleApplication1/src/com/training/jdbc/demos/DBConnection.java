package com.training.jdbc.demos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	public final static String DB_DRIVER_CLASS = "org.postgresql.Driver";
	public static String DB_URL = "jdbc:postgresql://localhost:5432/vastpro";
	public static String DB_USER = "postgres";
	public static String DB_PASSWORD = "postgres";
	public static String INSERT = "INSERT INTO student(roll_no,student_name,address,phone_no) values(?,?,?,?);";

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(DB_DRIVER_CLASS);
		} catch (ClassNotFoundException cf) {
			cf.printStackTrace();
		}
		Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		System.out.println("DB Connection successfull");
		return connection;
	}

	public static void insertRowForStudent(Connection conn, int rollno, String studentName, String studentAddress,String phoneNo) throws SQLException
	{
		PreparedStatement ps = conn.prepareStatement(INSERT);
		// Date d =new Date(1999, 12, 18);
		ps.setInt(1, rollno);
		ps.setString(2, studentName);
		ps.setString(3, studentAddress);
		ps.setString(4, phoneNo);

		ps.execute();
		ps.close();
	}
//	public static void insertRowForStudent(Connection conn, int rollno, String studentName, String studentAddress,String phoneNo) throws SQLException
//	{}

}
