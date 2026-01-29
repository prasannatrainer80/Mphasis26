package com.java.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookie
 */
public class AddCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Cookie ckSrinivas = new Cookie("srinivas", "87");
		ckSrinivas.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckSrinivas);
		Cookie ckManoj = new Cookie("manoj", "91");
		ckManoj.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckManoj);
		Cookie ckSrivi = new Cookie("srivi","89");
		ckSrivi.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckSrivi);
		out.println("Cookies are Created Sucessfully...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
