package com.springcore.bean.scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/bean/scope/app-config.xml");

		System.out.println("Before any getBean() call...");

		Student student = ctx.getBean("student", Student.class);
		System.out.println(student);

		Student student1 = ctx.getBean("student", Student.class);
		System.out.println(student1);

		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());

		ctx.close();
	}

}
