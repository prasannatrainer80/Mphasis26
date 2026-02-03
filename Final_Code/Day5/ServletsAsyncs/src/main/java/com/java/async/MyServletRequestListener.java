package com.java.async;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyServletRequestListener
 *
 */
@WebListener
public class MyServletRequestListener implements ServletRequestListener {

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
	System.out.println("Request Initialized. Remote IP: " + sre.getServletRequest().getRemoteAddr());
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
	System.out.println("Request Destroyed. Remote IP: " + sre.getServletRequest().getRemoteAddr());
	}
	/**
     * Default constructor. 
     */
    public MyServletRequestListener() {
        // TODO Auto-generated constructor stub
    }
	
}
