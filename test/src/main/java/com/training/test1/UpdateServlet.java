package com.training.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter pw=response.getWriter();  
        pw.print("<h1>Update Student Details</h1>"); 
   
       pw.print("<form action='UpdateServlet1' method='post'>");  
       pw.print("<table>");  
       pw.print("<tr><td>Id</td><td><input type='text' name='id' /></td></tr>");
       pw.print("<tr><td>RollNumber:</td><td><input type='text' name='rollno' /></td></tr>");  
       pw.print("<tr><td>name:</td><td><input type='text' name='name' </td></tr>"); 
       pw.print("<tr><td>Age:</td><td><input type='text' name='age' /></td></tr>"); 
       pw.print("<tr><td>TotalMarks:</td><td><input type='text' name='age' /></td></tr>"); 
       pw.print("<tr><td>Grade:</td><td>");  
       pw.print("<select name='Grade' style='width:150px'>");  
       pw.print("<option>A</option>");  
       pw.print("<option>B</option>");  
       pw.print("<option>c</option>");  
       pw.print("<option>s</option>");  
       pw.print("</select>");  
       pw.print("</td></tr>");  
       pw.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
       pw.print("</table>");  
       pw.print("</form>");
       pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
