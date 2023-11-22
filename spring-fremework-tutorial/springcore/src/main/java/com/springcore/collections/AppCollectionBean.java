package com.springcore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCollectionBean {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("collection-config.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
		System.out.println(employee.getProps().getProperty("username"));
		System.out.println(employee.getProps().getProperty("password"));

		context.close();

	}

}
