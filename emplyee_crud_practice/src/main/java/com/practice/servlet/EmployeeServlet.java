package com.practice.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.model.Employee;
import com.practice.service.EmployeeService;
import com.practice.utils.ConnectionFactory;


/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection = null;
	private EmployeeService service = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
       
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		connection = ConnectionFactory.getPostgresqlConnection();
		service = new EmployeeService(connection);
		System.out.println("Connection" + connection);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action=request.getServletPath();
		switch (action) {
		case "/":
//			handleInsert(request, response);
			break;
		case "/add":
			handleInsert(request, response);
			break;

		default:
			break;
		}
		
	}

	private void handleInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strEmpId=request.getParameter("empId");
		int employeeId=Integer.parseInt(strEmpId);
		String employeeName=request.getParameter("empName");
		String strPhNo=request.getParameter("phNo");
		
		String strSalary=request.getParameter("salary");
		double salary=Double.parseDouble(strSalary);
		String city=request.getParameter("city");
		
		Employee employee=new Employee(employeeId, employeeName, strPhNo, salary, city);
		Employee add=service.add(employee);
		request.setAttribute("add", add);
		RequestDispatcher dispatcher= request.getRequestDispatcher("/employee.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

	

}
