package com.java.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.serv.model.Employ;

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
		HttpSession session = request.getSession(true);
		Employ employ = (Employ)session.getAttribute("employ");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Employ No  <b>" +employ.getEmpno() + "</b><br/>");
		out.println("Employ Name  <b>" +employ.getName() + "</b><br/>");
		out.println("Department  <b>" +employ.getDept() + "</b><br/>");
		out.println("Designation  <b>" +employ.getDesig() + "</b><br/>");
		out.println("Basic  <b>" +employ.getBasic() + "</b><br/>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
