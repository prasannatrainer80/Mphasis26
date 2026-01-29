package com.java.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.jdbc.dao.EmployDao;
import com.java.jdbc.dao.EmployDaoImpl;
import com.java.jdbc.model.Employ;

/**
 * Servlet implementation class EmploySearchServlet
 */
public class EmploySearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmploySearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployDao employDao = new EmployDaoImpl();
		Employ employ = null;
		try {
			employ = employDao.searchEmployDao(empno);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		out.println("Employ Name  " +employ.getName() + "<br/>");
		out.println("Gender  " +employ.getGender() + "<br/>");
		out.println("Department  " +employ.getDept() + "<br/>");
		out.println("Designation  " +employ.getDesig() + "<br/>");
		out.println("Basic  " +employ.getBasic() + "<br/>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
