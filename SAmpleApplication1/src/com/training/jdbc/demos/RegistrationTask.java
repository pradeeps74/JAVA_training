package com.training.jdbc.demos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class RegistrationTask {

	static Scanner sc = new Scanner(System.in);
	static int idno,s6;

	static String s2, s3, s4, s5;

	private static void getUserData() {
		System.out.println("Enter registration id no ");
		idno = sc.nextInt();
//		System.out.println("Enter valid user name ");
//		s2 = sc.next();
//		System.out.println("Enter valid password");
//		s3 = sc.next();
//		System.out.println("Enter valid address");
//		s4 = sc.next();
//		System.out.println("Enter valid mailid");
//		s5 = sc.next();
//		System.out.println("enter idno you want to update ");
//		s6 = sc.nextInt();
	}

	public static void main(String[] args) {

		Connection conn = null;

		try {
			conn = DBConnectionTask.getConnection();
			System.out.println("get connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			for (int i = 1; i <=2; i++) {
				
				//DBConnectionTask.insertRowForRegistration(conn, idno, s2, s3, s4, s5);
				//DBConnectionTask.UpdateRowForRegistration(conn, s2, s3, s4, s5,s6);
				getUserData();
				//DBConnectionTask.deleteRowForRegistration(conn, idno);
				//DBConnectionTask.select1RowForRegistration(conn);
				DBConnectionTask.selectRowForRegistration(conn, idno);

			}
			//System.out.println("Successfully data inserted");
			//System.out.println("Successfully data Updated");
			//System.out.println("Successfully data deleted");
			System.out.println("suceesfully retriveed");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
