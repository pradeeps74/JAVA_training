package com.training.first;


import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstservlet
 */
@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public firstservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();

//		out.print("<html> <body><h6>Have a wonderful day</h6><p>Welcome to our site</p></body></html>");
		//String UserName = request.getParameter("txtName");
		//String Password = request.getParameter("txtPassword");
		//out.print("Hiii" + UserName);
//		if (UserName.equals("Admin") && Password.equals("vastpro")) {
//			out.print("welcome" + " " + UserName);
//		} else {User
//			out.print("invalid user or password");
//		}
//		out.println("<html><body><table border='2'>");
//		Enumeration paramNames = request.getParameterNames();
//		while (paramNames.hasMoreElements()) {
//			String paramName = (String) paramNames.nextElement();
//			out.print("<tr><td>"+paramName+"</td> \n <td>");
//			//out.print(paramName);
//			String[] paramValues = request.getParameterValues(paramName);
////read single value data
//			if (paramValues.length == 1) {
//				String paramValue = paramValues[0];
//				if (paramValue.length() == 0)
//					out.println("<i>No Value<i>");
//				else
//					out.println(paramValue);}
//			else {
//				// read multiple values data
//				out.println("<ul>");
//				for (int i = 0; i < paramValues.length; i++) {
//					out.println("<li>" +paramValues[i]);
//				}
//				out.println("</ul>");
//			}
//			out.println("</table>\n</body>\n</html>");
//		}
//		ServletContext context=getServletContext();
//		String greet=context.getInitParameter("greetings");
//		out.print(greet);
//		
//		RequestDispatcher rd=request.getRequestDispatcher("/SecondServlet");
//		rd.include(request, response);//include this servlet and another sevlet output
//		//rd.forward(request, response);//display second servlet output only

		//Cookie cookie = new Cookie("UserName", UserName);// creating cookies
		//response.addCookie(cookie);//adding cookies
		try{  
			  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String n=request.getParameter("userName");  
	        out.print("Welcome "+n);  
	          
	        //creating form that have invisible textfield  
	        //out.print("<form action='SecondServlet'>");  
	        //out.print("<input type='hidden' name='uname' value='"+"83853835"+"'>");  
	        //out.print("<input type='submit' value='go'>");  
	        //out.print("</form>");
	        out.print("<a href='SecondServlet?uname="+n+"'>visit</a>");  
	        out.close();  
	  
	                }catch(Exception e){System.out.println(e);}  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
