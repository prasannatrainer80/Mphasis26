package com.java.spr;


import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpElEx2 {
	public static void main(String[] args) {
		 Employ employ = new Employ();
	     employ.setEmpno(1);
	     employ.setName("Prasanna");
	     employ.setBasic(85823);
	     
	     Employ employ2 = new Employ();
	     employ2.setEmpno(2);
	     employ2.setName("Sagar");
	     employ2.setBasic(88723);

	      ExpressionParser parser = new SpelExpressionParser();
	      EvaluationContext context = new StandardEvaluationContext(employ);
	      Expression exp = parser.parseExpression("name");
	      
	      // evaluate object using context
	      String name = (String) exp.getValue(context);
	      System.out.println(name);


	      // evaluate object directly
	      name = (String) exp.getValue(employ2);
	      System.out.println(name);
	      exp = parser.parseExpression("empno > 1");
	      
	      // evaluate object using context
	      boolean result = exp.getValue(context, Boolean.class);
	      System.out.println(result);  // evaluates to false

	      result = exp.getValue(employ2, Boolean.class);
	      System.out.println(result);  // evaluates to true
	}
}
