package com.java.serv;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

/**
 * Application Lifecycle Listener implementation class MyRequestListener
 *
 */
@WebListener
public class MyRequestListener implements ServletRequestListener {

	private static Logger logger = Logger.getLogger(MyRequestListener.class);
    /**
     * Default constructor. 
     */
    public MyRequestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("Request Destroyed. Remote IP: " 
    			+ sre.getServletRequest().getRemoteAddr());
    	logger.info("Hi You are accessed Servlet and got Destroyed "
    			+sre.getServletContext().getContextPath());
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
    	logger.info("Hi You are accessed Servlet "
    			+sre.getServletContext().getContextPath());
    	System.out.println("Request Initialized. Remote IP: " 
    + sre.getServletRequest().getRemoteAddr());
    }
	
}
