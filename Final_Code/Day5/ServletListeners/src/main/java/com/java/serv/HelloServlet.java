package com.java.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(HelloServlet.class);
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Welcome to Log4j Programming...");
		logger.info("Testing Log4j in Programs...");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext ctx = request.getServletContext();
        ctx.setAttribute("User", "Prasanna");
        String user = (String)ctx.getAttribute("User");
        ctx.removeAttribute("User");
		out.println("Welcome to Log4J Example...");
		HttpSession session = request.getSession(true);
		session.setAttribute("trainer", "Prasanna");
		session.invalidate();
		logger.warn("Task to be finished at any cost today...");
		logger.info("From Mphasis Training Jan 2026 ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
