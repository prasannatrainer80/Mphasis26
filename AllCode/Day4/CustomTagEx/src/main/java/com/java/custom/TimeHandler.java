package com.java.custom;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TimeHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		Date date = new Date();
		JspWriter out = pageContext.getOut();
		try {
			out.println("Time is <b>" +date.getHours() + ":" 
					+date.getMinutes() + ":" +date.getSeconds());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
