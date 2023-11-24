package com.springcore.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Student student = ctx.getBean("student", Student.class);

		System.out.println(student);

		ctx.close();
	}

}
