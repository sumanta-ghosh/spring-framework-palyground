package com.springcore.autowired;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAutowired {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/autowired/autowired-config.xml");
		ctx.registerShutdownHook();

		Employee emp = ctx.getBean("employee", Employee.class);
		System.out.println(emp);

//		Employee emp1 = ctx.getBean("employee1", Employee.class);
//		System.out.println(emp1);

		Employee emp2 = ctx.getBean("employee2", Employee.class);
		System.out.println(emp2);

	}

}
