package com.training.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionTask {
	public final static String DB_DRIVER_CLASS = "org.postgresql.Driver";
	public static String DB_URL = "jdbc:postgresql://localhost:5432/vastpro";
	public static String DB_USER = "postgres";
	public static String DB_PASSWORD = "postgres";
	public static String INSERT = "insert into registration (Idno,user_Name,user_Password,address,mailId) values(?,?,?,?,?);";
	public static String UPDATE = "update registration set user_name=?,user_password=?,address=?,mailid=? where idno=?;";
	public static String DELETE = "delete  from registration where idno=?;";
	public static String SELECT1 = "select *  from registration;";
	public static String SELECT = "select *  from registration where idno=?;";
	

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(DB_DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		System.out.println("successfully completed");
		return connection;
	}

	public static void insertRowForRegistration(Connection conn, int id, String name, String password, String address,
			String mailId) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(INSERT);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, password);
		ps.setString(4, address);
		ps.setString(5, mailId);
		ps.execute();
		ps.close();
	}

	public static void UpdateRowForRegistration(Connection conn, String name, String password, String address,
			String mailId, int idno) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(UPDATE);

		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, address);
		ps.setString(4, mailId);

		ps.setInt(5, idno);
		ps.executeUpdate();
		ps.close();
	}

	public static void select1RowForRegistration(Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SELECT1);
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		System.out.println("name"+" "+rs.getString("user_Name"));
	}
		ps.close();
	}
	public static void selectRowForRegistration(Connection conn,int idno) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SELECT);
		ps.setInt(1, idno);
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		System.out.println("name"+" "+rs.getString("user_Name")+rs.getString("user_Password"));
	}
		ps.close();
	}
}
