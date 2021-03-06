package com.training.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import com.demo.service.BookService;
import com.example.demo.model.Book;
import com.training.utils.ConnectionFactory;

//to check database is connected
/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection = null;
	private BookService service = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookServlet() {
		super();

	}

	@Override
	public void init() throws ServletException {
		connection = ConnectionFactory.getPostgresqlConnection();
		try {
			service = new BookService(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection" + connection);
	}

	@Override
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		case "/books":
			handleFindAll(request, response);
			break;
		case "/delete":
			handleRemove(request, response);
			break;
		case "/edit":
			handleEdit(request, response);
			break;

		default:
			break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		switch (action) {
		case "/update":
			handleUpdate(request, response);
			break;
		case "/add":
			handleInsert(request, response);
			break;

		default:
			break;
		}
		
	}

	private void handleInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strBookNumber = request.getParameter("bookNumber");
		int bookNumber = Integer.parseInt(strBookNumber);
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		String strPrice = request.getParameter("price");
		double price = Double.parseDouble(strPrice);
		Book entity = new Book(bookNumber, bookName, authorName, price);
		Book addedBook = service.add(entity);
		// request.setAttribute("added", addedBook);
		request.setAttribute("message", "one book added");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addBook.jsp");
		dispatcher.forward(request, response);
		
	}

	public void handleFindAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> books = service.findAll();
		request.setAttribute("books", books);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/showBooks.jsp");
		dispatcher.forward(request, response);
	}

	public void handleRemove(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strId = request.getParameter("id");
		int id = Integer.parseInt(strId);
		Book book = service.remove(id);
		List<Book> books = service.findAll();
		request.setAttribute("books", books);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/showBooks.jsp");
		dispatcher.forward(request, response);
	}

	private void handleEdit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strId = request.getParameter("id");
		int id = Integer.parseInt(strId);

		Book bookToEdit = service.findBookById(id);
		request.setAttribute("bookToEdit", bookToEdit);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addBook.jsp");
		dispatcher.forward(request, response);
	}
	private void handleUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String strId = request.getParameter("id");
		//int id = Integer.parseInt(strId);
		
		String strBookNumber = request.getParameter("bookNumber");
		int bookNumber = Integer.parseInt(strBookNumber);
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		String strPrice = request.getParameter("price");
		double price = Double.parseDouble(strPrice);
		Book entity = new Book(bookNumber, bookName, authorName, price);
		Book bookUpdate=service.update(entity);
		request.setAttribute("update", bookUpdate);
		if(bookUpdate!=null) {
			request.setAttribute("message", "One book updated");
		}
		else {
			request.setAttribute("message", "Error in updating book");
		}
		RequestDispatcher dispatcher =request.getRequestDispatcher("/addBook.jsp");
		dispatcher.forward(request, response);
		
	}
}
