package com.training.test1;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StudentDataBase {
	/*
	 * create table student(id varchar ( 20 ) primary key,
					 rollno varchar ( 20 ) not null,
					  name varchar ( 50 ) not null,
					  age varchar ( 20 ) ,
					  totalmarks varchar ( 20 ) ,
					  grade varchar ( 20 ) );
	 */
	
    public static int insert(Student s) {
    	int status=0;
    	try {
    		Connection con=DbConnection.getConnection();
    		PreparedStatement ps= con.prepareStatement("insert into student(id,rollno,name,age,totalmarks,grade)values(?,?,?,?,?,?);");
    		ps.setString(1, s.getId());
    		ps.setString(2, s.getRollNo());
    		ps.setString(3, s.getName());
    		ps.setString(4, s.getAge());
    		ps.setString(5, s.getTotalMarks());
    		ps.setString(6, s.getGrade());
    		status=ps.executeUpdate();
    		con.close();
    		}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	return status;
    }
    public static int update(Student s) {
    	int status=0;
    	try {
    		Connection con=DbConnection.getConnection();
    		PreparedStatement ps= con.prepareStatement("update student set id=?,name=?,age=?, totalmarks=?,grade=? where rollno=?");
    		ps.setString(1, s.getId());
    		ps.setString(2, s.getName());
    		ps.setString(3, s.getAge());
    		ps.setString(4, s.getTotalMarks());
    		ps.setString(5, s.getGrade());
    		ps.setString(6, s.getRollNo());
    		status=ps.executeUpdate();
    		con.close();
    		}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	return status;
    }
    public static int delete(Student s) {
    	int status=0;
    	try {
    		Connection con=DbConnection.getConnection();
    		PreparedStatement ps= con.prepareStatement("delete from student where rollno=?");
    		ps.setString(1, s.getRollNo());
    		status=ps.executeUpdate();
    		con.close();
    		}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	return status;
    }
    public static Student getStudentByGrade(String grade) {
       Student s=new Student();
    	try {
    		Connection con=DbConnection.getConnection();
    		PreparedStatement ps= con.prepareStatement("select * from student where grade='s';");
    		ps.setString(1, grade);
    	    ResultSet rs=ps.executeQuery();
    	     while(rs.next()){  
    	                s.setId(rs.getString(1));  
    	                s.setRollNo(rs.getString(2));  
    	                s.setName(rs.getString(3));  
    	                s.setAge(rs.getString(4));  
    	                s.setTotalMarks(rs.getString(5)); 
    	                s.setGrade(rs.getString(6));  
    	            }  
    	            con.close();  
    	        }catch(Exception ex){ex.printStackTrace();}  
    	          
    	        return s;  
    	    }  
    	    public static List<Student> getAllStudents() {  
    	        List<Student> list=new ArrayList<Student>();  
    	          
    	        try{  
    	            Connection con=DbConnection.getConnection();  
    	            PreparedStatement ps=con.prepareStatement("select * from Student");  
    	            ResultSet rs=ps.executeQuery();  
    	            while(rs.next()){  
    	            	Student s=new Student();  
    	            	s.setId(rs.getString(1));  
    	                s.setRollNo(rs.getString(2));  
    	                s.setName(rs.getString(3));  
    	                s.setAge(rs.getString(4));  
    	                s.setTotalMarks(rs.getString(5)); 
    	                s.setGrade(rs.getString(6));
    	                list.add(s);  
    	            }  
    	            con.close();  
    	        }catch(Exception e){e.printStackTrace();}  
    	          
    	        return list;  
    	    }  
   
    }
   

