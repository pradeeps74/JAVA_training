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
 * Servlet implementation class BookRequestServlet
 */
@WebServlet("/BookRequestServlet")

public class BookRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	HashMap<Long,Integer> ha=new HashMap<Long,Integer>();
    public BookRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
        ha.put(1214521453541245l,1234);  //Put elements in Map  
        ha.put(2345161245789456l,2456);    
        ha.put(3561361453784516l,2468);   
        ha.put(1245564596333545l,1812);
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
	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");  
        PrintWriter pw=response.getWriter(); 
    String cardno=request.getParameter("cardno");  
        String pinno=request.getParameter("pinno"); 
        for( Map.Entry m:ha.entrySet()){    
            if(cardno.equals(m.getKey())&&pinno.equals(m.getValue())) {
               pw.print("check book requested");
            }
            else {
            	pw.print("check book not requested");
            }
           } 
          
        pw.close();  
	}

}
