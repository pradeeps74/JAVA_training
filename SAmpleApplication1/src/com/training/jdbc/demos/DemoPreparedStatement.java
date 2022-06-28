package com.training.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoPreparedStatement {
public static void main(String[] args) {
	Connection con=null;
	
	Scanner sc = new Scanner(System.in);
	try {
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro", "postgres", "postgres");
		//String sql="select * from employee1 where emp_id=?";
		//String sql="update employee1 set emp_name=? where emp_id=17;";
		//String sql="insert into employee1 values(?,?,?,?,?,?);";
		//String sql ="update employee1 set emp_salary=? where emp_id=5;";
		String sql="delete from employee1 where emp_id =?;";
		PreparedStatement ps=con.prepareStatement(sql);
	System.out.println("Enter employee id ");
//		int id =sc.nextInt();
//		ps.setInt(1, id);
	int id =sc.nextInt();
	ps.setInt(1, id);
//		System.out.println("Enter employee name ");
//		String name=sc.next();
//		ps.setString(2, name);
//		System.out.println("Enter mobile phone no ");
//		String phone=sc.next();
//		ps.setString(3, phone);
//		System.out.println("Enter mail id ");
//		String mail=sc.next();
//		ps.setString(4, mail);
//		System.out.println("Enter salary amount");
//		//int salary =sc.nextInt();
//		int alterSalary=sc.nextInt();
//		ps.setInt(1, alterSalary);
//		ps.setInt(5, salary);
//		System.out.println("Enter city amount");
//		String city=sc.next();
//		ps.setString(6, city);
		
		//ResultSet rs =ps.executeQuery();
		//ps.executeUpdate();
		ps.executeUpdate();
//		while(rs.next()) {
//			System.out.println("name"+" "+rs.getString("emp_name"));
//		}
//			sc.close();	
	}
	catch (SQLException s) {
		s.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
