package com.springcore.standalone.collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStandaloneCollection {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standalone-config.xml");
		ctx.registerShutdownHook();
		Person person = ctx.getBean("person1", Person.class);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println(person);
		System.out.println(person.getConfigDetails().getProperty("username"));

	}

}
