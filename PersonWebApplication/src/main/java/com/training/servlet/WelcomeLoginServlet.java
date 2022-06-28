package com.training.servlet;

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
public class WelcomeLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeLoginServlet() {
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
			welcomePerson(request, response);
			break;
		case "/add":
			addPerson(request, response);
			break;
		case "/show":
			showPerson(request, response);
			break;

		default:
			break;
		}
	}

	private void welcomePerson(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("heading", "Vastpro Technologies");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Home.jsp");
		dispatcher.forward(request, response);

	}

	private void addPerson(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("heading", "Vastpro Technologies");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
		dispatcher.forward(request, response);

	}

	private void showPerson(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String hobbies[] = request.getParameterValues("Hobbies"); 
		String qualification = request.getParameter("qualification");

		Person obj = new Person(firstName, lastName, hobbies, qualification);
		request.setAttribute("person", obj);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ShowPerson.jsp");
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
