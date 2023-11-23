package com.springcore.autowired.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAutowiredAnnotation {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/autowired/annotation/autowired-config.xml");
		ctx.registerShutdownHook();

		Employee emp = ctx.getBean("employee", Employee.class);
		System.out.println(emp);

	}

}
