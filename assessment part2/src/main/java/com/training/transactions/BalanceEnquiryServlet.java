package com.training.transactions;

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
 * Servlet implementation class BalanceEnquiryServlet
 */
@WebServlet("/BalanceEnquiryServlet")
public class BalanceEnquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	HashMap<String,String> h=new HashMap<String,String>();
    public BalanceEnquiryServlet() {
        super();
        // TODO Auto-generated constructor stub
        h.put("1214521453541245l","12340");  //Put elements in Map  
        h.put("2345161245789456l","24560");    
        h.put("3561361453784516l","246800");   
        h.put("1245564596333545l","181200");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter pw=response.getWriter(); 
        pw.println("<h1>  Balance enquiry</h1>"); 
        pw.println("<body><form  method='post'>");	
        pw.println("card no:<input type='text' name='cardno' placeholder='enter the amount'><br>");

        pw.println("<input type='submit' name='enquiry'>");
        pw.println("</form></body"); 
       String card=request.getParameter("cardno");  
     
        for( Map.Entry m:h.entrySet()){    
            if(card.equals(m.getKey())) {
               pw.println("Account balance :"+m.getValue());
            }
          
           } 
          
        pw.close();  
	}

}
