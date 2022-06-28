package com.training.transactions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StatementServlet
 */
@WebServlet("/StatementServlet")
public class StatementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatementServlet() {
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
        String cardno=request.getParameter("cardno");  
        String pinno=request.getParameter("pinno"); 
       pw.print("Bank Card Number");
        pw.print(cardno);
        pw.print("Bankaccount Pin Number");
        pw.print(pinno);
        pw.print("withdraw amount =15000");
        pw.print("Deposit amount=20000");
        pw.print("balance amount=1000");
        pw.print("thanks for visiting");
		
}
}
