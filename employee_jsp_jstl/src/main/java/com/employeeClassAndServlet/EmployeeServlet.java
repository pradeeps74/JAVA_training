package com.employeeClassAndServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeService.EmployeeService;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      EmployeeService service; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service=new EmployeeService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Employee vastpro = new Employee(01,"PRA007","Pradeep",12500.98);
	List<Employee> employeeList=service.findAll();
		request.setAttribute("employee", employeeList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("showEmployee.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strId=request.getParameter("id");
		int id = Integer.parseInt(strId);
		String employeeId = request.getParameter("employeeId");
		String employeeName=request.getParameter("employeeName");
		String strSalary = request.getParameter("employeeSalary");
		double salary=Double.parseDouble(strSalary);
		Employee entity = new Employee(id, employeeId, employeeName, salary);
		Employee addEmployee=service.add(entity);
		request.setAttribute("employee", addEmployee);
		 RequestDispatcher dispatcher =request.getRequestDispatcher("success.jsp");
		 dispatcher.forward(request, response);
	}

}
