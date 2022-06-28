package com.training.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try    
	        {    
	            Class.forName("org.postgresql.Driver");    
	            String url="jdbc:postgresql://localhost:5432/vastpro";    
	            String user="postgres";    
	            String Password="postgres";    
	                
	            Connection con=DriverManager.getConnection(url, user, Password);    
	            String query="Insert into employee(name,password,email,country) values (?,?,?,?);";    
	            PreparedStatement pstmt=con.prepareStatement(query);    
	      
	         
	                
	            int x=pstmt.executeUpdate();    
	                
	            if(x==1)    
	            {    
	            System.out.println("Values Inserted Successfully");    
	            } 
	            else {
	            	 System.out.println("Values not Inserted Successfully");  
	            }
	                
	        } 
	        catch(ClassNotFoundException e) {
	        	e.printStackTrace();
	        }
	        catch(SQLException  e)    
	        {    
	                e.printStackTrace();    
	        } 


	}

}
