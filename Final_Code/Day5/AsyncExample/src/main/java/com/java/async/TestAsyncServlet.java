package com.java.async;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestAsyncServlet
 */
public class TestAsyncServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	  @Override
	  protected void doGet(HttpServletRequest request, 
	      HttpServletResponse response) throws ServletException, IOException {

	    final long startTime = System.nanoTime();
	    final AsyncContext asyncContext = request.startAsync(request, response);

	    new Thread() {

	      @Override
	      public void run() {
	        try {
	          ServletResponse response = asyncContext.getResponse();
	          response.setContentType("text/plain");
	          PrintWriter out = response.getWriter();
	          Thread.sleep(2000);
	          out.print("Work completed. Time elapsed: " + (System.nanoTime() - startTime));
	          out.flush();
	          asyncContext.complete();
	        } catch (IOException | InterruptedException e) {
	          throw new RuntimeException(e);
	        }
	      }
	    }.start();

	  }

}
