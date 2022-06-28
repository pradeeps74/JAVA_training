package com.training.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration {
	

	public static void main(String[] args) {
		Connection conn=null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName(DB_DRIVER_CLASS);
			conn=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		//String sql ="insert into registration (Idno,user_Name,user_Password,address,mailId) values(?,?,?,?,?)";
			//String sql="update registration set idno=? where user_Name ='vijaya';";
			//String sql="delete from registration where mailId=?; ";
			String sql ="Select * from registration";
			PreparedStatement ps = conn.prepareStatement(sql);
//			System.out.println("Enter registration id no ");
//			int idno=sc.nextInt();
//			ps.setInt(1, idno);
//			System.out.println("Enter valid user name ");
//			String s2=sc.next();
//			ps.setString(2, s2);
//			System.out.println("Enter valid password");
//			String s3=sc.next();
//			ps.setString(3, s3);
//			System.out.println("Enter valid address");
//			String s4=sc.next();
//			ps.setString(4, s4);
//			System.out.println("Enter valid mailid");
//			String s5=sc.next();
//			ps.setString(5, s5);
			//ps.setString(1, s5);
			//ps.executeUpdate();
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				System.out.println("name"+" "+rs.getString("user_Name"));
			}
			conn.close();
			ps.close();
		
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	

	}
	public final static String DB_DRIVER_CLASS = "org.postgresql.Driver";
	public static String DB_URL = "jdbc:postgresql://localhost:5432/vastpro";
	public static String DB_USER = "postgres";
	public static String DB_PASSWORD = "postgres";
}
