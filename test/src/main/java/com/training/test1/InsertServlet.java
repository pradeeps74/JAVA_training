package com.training.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
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
		//doGet(request, response);
		 response.setContentType("text/html");  
	        PrintWriter pw=response.getWriter();  
	        String id=request.getParameter("id");
	        String rollno=request.getParameter("rollno");
	        String name=request.getParameter("name");  
	        String age=request.getParameter("age");
	        String totalmarks=request.getParameter("marks");  
	        String grade=request.getParameter("grade");  
	          Student e=new Student(); 
	       e.setId(id);
	        e.setRollNo(rollno);  
	        e.setName(name);  
	        e.setAge(age);  
	        e.setTotalMarks(totalmarks);  
	        e.setGrade(grade);  
	        int status=StudentDataBase.insert(e);  
	        if(status>0){  
	            pw.print("<p>Record inserted successfully!</p>");  
	            request.getRequestDispatcher("studentindex.html").include(request, response);  
	        }else{  
	            pw.println("Sorry! unable to insert record");  
	        } 
	         
	       
	        pw.close();  
    

	}
}
