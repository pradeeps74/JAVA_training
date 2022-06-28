package com.training.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet1
 */
@WebServlet("/SaveServlet1")
public class SaveServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter pw;    
        response.setContentType("text/html");    
        pw=response.getWriter();    
            
            
        String name=request.getParameter("name");    
        String password=request.getParameter("password");    
        String email=request.getParameter("email");    
        String country=request.getParameter("country");    
      
            
            
        try    
        {    
            Class.forName("org.postgresql.Driver");    
            String url="jdbc:postgresql://localhost:5432/vastpro";    
            String user="postgres";    
            String Password="postgres";    
                
            Connection con=DriverManager.getConnection(url, user, Password);    
            String query="Insert into employee(name,password,email,country) values (?,?,?,?);";    
            PreparedStatement pstmt=con.prepareStatement(query);    
            pstmt.setString(1, name);    
            pstmt.setString(2, password);    
            pstmt.setString(3,email);    
            pstmt.setString(4, country);    
         
                
            int x=pstmt.executeUpdate();    
                
            if(x==1)    
            {    
            pw.println("Values Inserted Successfully");    
            }    
                
        } 
        catch(ClassNotFoundException e) {
        	e.printStackTrace();
        }
        catch(SQLException  e)    
        {    
                e.printStackTrace();    
        } 
      
            
            
        pw.close();    
	}

}
