package com.training.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Boolean value=false;
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	HashMap<String,String> ma=new HashMap<String,String>();
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
        ma.put("lavanya", "lavanya1");
        ma.put("venky", "venky1");
        ma.put("lavi", "lavi1");
        ma.put("mathavi", "mathavi1");
     
        }
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String username=request.getParameter("txtName");
		String password=request.getParameter("txtPassword");
		PrintWriter pw=response.getWriter();
		//pw.print("username  "+username);
		//pw.print("\n password  "+password+"\n");
		
		for(Map.Entry m:ma.entrySet()){    
		      if(m.getValue().equals(password) && m.getKey().equals(username))
		     {
			pw.print("Name/Password match");
			value=true;
			break;
		    }   
		}
		if(value==false) {
			pw.print("Name/Password does not match");
			
		    } 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
