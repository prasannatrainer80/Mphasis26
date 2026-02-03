package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpEl4 {
	public static void main(String[] args) {
		 ApplicationContext ctx =
	                new AnnotationConfigApplicationContext(AppConfig.class);

		 EmpSpEl obj = ctx.getBean(EmpSpEl.class);
	      obj.show();
	}
}
