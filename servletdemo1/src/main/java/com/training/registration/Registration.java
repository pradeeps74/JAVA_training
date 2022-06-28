package com.training.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Registration() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	  String userName=request.getParameter("txtName");
		String password=request.getParameter("txtPassword");
		String address=request.getParameter("txtAddress");
		String phoneno=request.getParameter("txtPhoneno");
		HttpSession mysession1=request.getSession();
		mysession1.setAttribute("user", userName);
		mysession1.setAttribute("password",password);
        PrintWriter pw=response.getWriter();
        if(userName.isBlank()|| password.isBlank()) 
        {
        	RequestDispatcher rd=request.getRequestDispatcher("/registration.html");
    		rd.include(request, response);
        }
        else
        {
        	pw.print("username"+userName);
        	pw.print("password"+password);
        	pw.print("address"+address);
        	pw.print("phonenumber"+phoneno);
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
