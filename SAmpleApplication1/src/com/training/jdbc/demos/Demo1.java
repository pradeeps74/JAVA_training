package com.training.jdbc.demos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement state = null;
		ResultSet rs = null;

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro", "postgres", "postgres");
			System.out.println("Opened database Sucessfully");
			//String sql = "insert into employee values(78,'munees','ramanad','9876543210','munees.com',55000);";
			//String sql = "delete from employee where emp_id=7;";
			//String sql ="update employee set emp_name='pradeep'where emp_id=17;";
			String sql ="alter table employee rename to Employee1;";
			state = con.createStatement();
			int rowsAffected=state.executeUpdate(sql);
			System.out.println(rowsAffected+" "+"DATA DELETED SUCESSFULLY");

			//rs = state.executeQuery("select * from student;");
//			while (rs.next()) {
//				int id = rs.getInt("emp_id");
//				String name = rs.getString("emp_name");
//				String city = rs.getString("emp_city");
//				String phone = rs.getString("emp_phone");
//				String mail = rs.getString("emp_mail");
//				float salary = rs.getFloat("emp_salary");
//				System.out.println("Id is " + " " + id);
//				System.out.println("Name is " + " " + name);
//				System.out.println("city is " + " " + city);
//				System.out.println("phoneno is " + " " + phone);
//				System.out.println("email id  is " + " " + mail);
//				System.out.println("salary is " + " " + salary);
//
//			}
		} catch (SQLException s) {
			s.printStackTrace();
			System.err.println(s.getClass().getName() + " " + s.getMessage());
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + " " + e.getMessage());
		}
	}

}
