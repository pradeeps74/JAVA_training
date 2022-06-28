package com.training.transactions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private static double balanceAmount=50000;
	  private static double balance;
	//creating hashmap for cardno and pinno
	HashMap<Long,Integer> map=new HashMap<Long,Integer>();
	
    public WithdrawServlet() {
        super();
        // TODO Auto-generated constructor stub
        map.put(1214521453541245l,1234);  //Put elements in Map  
        map.put(2345161245789456l,2456);    
        map.put(3561361453784516l,2468);   
        map.put(1245564596333545l,1812);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter pw=response.getWriter(); 
       
        pw.println("<body><form  method='post'>");	
        pw.println("card no:<input type='text' name='cardno' placeholder='enter the amount'><br>");
        pw.println("pin no:<input type='text' name='pinno' placeholder='enter the amount'><br>");
        pw.println("Withdraw amount:<input type='text' name='amount' placeholder='enter the amount'>");
        pw.println("<input type='submit' name='withdrawamount'>");
        pw.println("</form></body"); 
        
        long draw=Long.parseLong(request.getParameter("amount"));
//        String cardn=request.getParameter("cardno");  
//        String pinn=request.getParameter("pinno"); 
//   
       
        	
          
          if(draw<balanceAmount) {
                	 balance=  balanceAmount-draw;
                 	pw.print(balance);
                  }
                 else {
                	 pw.print("insufficient balance");
                 }
            
           
           
          
        pw.close();  
        }
      
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
