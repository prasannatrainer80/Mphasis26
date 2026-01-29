package com.java.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.jdbc.dao.EmployDao;
import com.java.jdbc.dao.EmployDaoImpl;
import com.java.jdbc.model.Employ;

/**
 * Servlet implementation class EmployShowServlet
 */
public class EmployShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		EmployDao employDao = new EmployDaoImpl();
		List<Employ> employList = null;
		try {
			 employList = employDao.showEmployDao();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		out.println("<table border='3' align='center'>");
		out.println("<tr><th>Employ No</th><th>Employ Name</th><th>Gender</th>"
				+ "<th>Department</th><th>Designation</th><th>Basic</th></tr>");
		for(Employ employ : employList) {
			out.println("<tr><td>" +employ.getEmpno() +"</td>"
					+ "<td>" +employ.getName() + "</td>"
					+ "<td>" +employ.getGender() + "</td>"
					+ "<td>" +employ.getDept() + "</td>"
					+ "<td>" +employ.getDesig() + "</td>"
					+ "<td>" +employ.getBasic() + "</td>"
					+ "</tr>");
			
		}
		out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
