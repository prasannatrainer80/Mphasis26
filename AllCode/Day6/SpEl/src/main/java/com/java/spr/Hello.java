package com.java.spr;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Hello {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp =  parser.parseExpression("'Welcome to SPEL'");
		String message = (String) exp.getValue();
		System.out.println(message);
	}
}
