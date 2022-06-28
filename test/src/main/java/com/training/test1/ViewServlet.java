package com.training.test1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
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
        PrintWriter out=response.getWriter();  
        out.println("<a href='studentindex.html'>Add New Student Details</a>");  
        out.println("<h1>Employees List</h1>");  
        
        List<Student> list=StudentDataBase.getAllStudents();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>RollNumber</th><th>Name</th><th>Age</th><th>Totalmarks</th><th>Grade</th> <th>Edit</th><th>Delete</th></tr>");  
              
        for(Student e:list){  
        	out.print("<tr><td>"+e.getId()+"</td><td>"+e.getRollNo()+"</td><td>"+e.getName()+"</td>  <td>"+e.getAge()+"</td><td>"+e.getTotalMarks()+"</td><td>"+e.getGrade()+"</td><td><a href='EditServlet?id="+e.getId()+"'>edit</a></td>  <td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
    
        out.close();  
	}

}