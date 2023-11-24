package com.springcore.stereotype.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/app-config.xml");

		Student student = ctx.getBean("student", Student.class);
		System.out.println(student);

		ctx.close();
	}

}
