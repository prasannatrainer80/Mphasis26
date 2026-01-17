package com.java.custom;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
	    Calendar cal = Calendar.getInstance();
	    JspWriter out = pageContext.getOut();

	    try {
	        out.println("Date is "
	            + cal.get(Calendar.DAY_OF_MONTH) + "-"
	            + (cal.get(Calendar.MONTH) + 1) + "-"
	            + cal.get(Calendar.YEAR));
	    } catch (IOException e) {
	        throw new JspException(e);
	    }
	    return SKIP_BODY;
	}

}
