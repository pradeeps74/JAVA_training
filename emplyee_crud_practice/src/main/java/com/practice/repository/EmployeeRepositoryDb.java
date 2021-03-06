package com.practice.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.practice.iface.CrudRepository;
import com.practice.model.Employee;

public class EmployeeRepositoryDb implements CrudRepository<Employee> {

	private Connection connection=null;
	
	

	public EmployeeRepositoryDb(Connection connection) {
		super();
		this.connection=connection;
	}

	@Override
	public Employee add(Employee t) {
		int rowsAdded=0;
		try (PreparedStatement pstmt=connection.prepareStatement("insert into employee (emp_id,emp_name,phone_no,salary,city) "
				+ "values(?,?,?,?,?)")){
			pstmt.setInt(1,t.getEmployeeId());
			pstmt.setString(2,t.getEmployeeName());
			pstmt.setString(3,t.getPhoneNo());
			pstmt.setDouble(4,t.getSalary());
			pstmt.setString(5,t.getCity());
			
			rowsAdded =pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return rowsAdded==1?t:null;
	}

	@Override
	public List<Employee> findAll() {
		
		String sql = "select * from employee";
		List<Employee> bookList=new ArrayList();
		try (PreparedStatement pstmt=connection.prepareStatement(sql);){
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int bookNumber=rs.getInt("bookNumber");
				String bookName=rs.getString("bookName");
			String authorName=rs.getString("authorName");;
			 double price=rs.getDouble("price");
			 Employee eachBook = new Employee();
			 bookList.add(eachBook);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}
		return bookList;
	
	}

}
