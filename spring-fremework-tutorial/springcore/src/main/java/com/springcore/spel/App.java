package com.springcore.spel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/spel/app-config.xml");

		Student student = ctx.getBean("student", Student.class);
		System.out.println(student);

		SpelExpressionParser temp = new SpelExpressionParser();
		Expression parseExpression = temp.parseExpression("020+30");
		System.out.println(parseExpression.getValue());

		ctx.close();

	}

}
