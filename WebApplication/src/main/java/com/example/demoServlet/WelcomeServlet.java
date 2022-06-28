package com.example.demoServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		// System.out.println("Action is :"+ action);
		switch (action) {
		case "/":
			welcomePage(request, response);
			break;
		case "/add":
			addPage(request, response);
			break;
		case "/show":
			showPage(request, response);
			break;

		default:
			break;
		}
		request.setAttribute("heading", "Gandhi school");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
          
	}

	private void addPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("heading", "Gandhi school");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addStudent.jsp");
		dispatcher.forward(request, response);

	}

	private void showPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("heading", "Gandhi school");
		String strRollNUmber = request.getParameter("rollNumber");
		int rollNumber = Integer.parseInt(strRollNUmber);
		String studentName = request.getParameter("studentName");
		String strMark = request.getParameter("mark");
		double mark = Double.parseDouble(strMark);
		Student obj = new Student(rollNumber, studentName, mark);
		request.setAttribute("student", obj);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/showStudent.jsp");
		dispatcher.forward(request, response);

	}

	private void welcomePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("heading", "Gandhi school");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
		dispatcher.forward(request, response);

	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
