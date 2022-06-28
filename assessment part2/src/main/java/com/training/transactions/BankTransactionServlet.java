package com.training.transactions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankTransactionServlet
 */
@WebServlet("/BankTransactionServlet")
public class BankTransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
     * @see HttpServlet#HttpServlet()
     */
    public BankTransactionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
  
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

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
        String req=request.getParameter("Request"); 
        if(Pattern.matches("[0-9]{16}", cardno) && Pattern.matches("[0-9]{4}", pinno)) {
        	pw.print("valid card number");
        }
        else {
        	pw.println("Invalid card number and pinno");
        }
        
        if(req.equals("Withdraw")) {
        	response.sendRedirect("WithdrawServlet");
        }
        else if(req.equals("Balance Enquiry")) {
        	response.sendRedirect("BalanceEnquiryServlet");
        }
        if(req.equals("Mini Statement")) {
        	response.sendRedirect("StatementServlet");
        }
        if(req.equals("CheckBook Request")) {
        	response.sendRedirect("BookRequestServlet");
        }



	}

}
