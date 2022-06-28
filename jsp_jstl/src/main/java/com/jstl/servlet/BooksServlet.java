package com.jstl.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jstl.training.services.BookService;

/**
 * Servlet implementation class BooksServlet
 */
@WebServlet("/")
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookService service;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BooksServlet() {
		super();

	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		service = new BookService();
		super.init();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);
		switch (action) {
//		case "/books":
//			showBook(request, response);
//			break;
//		case "/book":
//			showBook(request, response);
//			break;
//		case "/add":
//			addBook(request, response);
//			break;
		case "/findBooks":
			findBooks(request, response);
			break;
		case "/findBookByName":
			findBookByName(request, response);
			break;
		default:
			
			break;
		}

	}
//
//	private void showBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		Book bookList =service.findBookByName(null);
//		request.setAttribute("books", bookList);
//		 RequestDispatcher dispatcher =request.getRequestDispatcher("showBooks.jsp");
//		 dispatcher.forward(request, response);
//		
//	}
//
//	private void showHome(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
//		dispatcher.forward(request, response);
//
//	}

//	private void addBook(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("addBook.jsp");
//		dispatcher.forward(request, response);
//	}
//
	private void findBooks(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> booksList = service.findAll();
		request.setAttribute("books", booksList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("showBooks.jsp");
		dispatcher.forward(request, response);

	}
//	
//
	private void findBookByName(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String bookName = request.getParameter("bookName");

		Book bookList = service.findBookByName(bookName);

		request.setAttribute("book", bookList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/showBook.jsp");
		dispatcher.forward(request, response);

	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
////		 Book java = new Book(1010,"Head First Java","Kathy Steera",450);
////		 request.setAttribute("book", java);
//		
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strBookNumber = request.getParameter("bookNumber");
		int bookNumber = Integer.parseInt(strBookNumber);
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		String strPrice = request.getParameter("price");
		double price = Double.parseDouble(strPrice);
		Book entity = new Book(bookNumber, bookName, authorName, price);
	//	Book addedBook = service.add(entity);
		//request.setAttribute("added", addedBook);
		Book insertBook =service.insert(entity);
		request.setAttribute("added", insertBook);
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
		
	}

}
