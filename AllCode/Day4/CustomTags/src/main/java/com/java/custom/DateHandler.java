package com.java.custom;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateHandler extends TagSupport {

	// <br/>
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		Date date = new Date();
		try {
			out.println("Date is " +date.getDay() + "-" +date.getMonth() + 
					"-" +date.getYear());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
