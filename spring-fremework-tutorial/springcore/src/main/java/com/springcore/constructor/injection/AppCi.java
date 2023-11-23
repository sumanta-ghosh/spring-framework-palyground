package com.springcore.constructor.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCi {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/constructor/injection/ci-config.xml");
		Person person = (Person) ctx.getBean("person");
		ctx.close();
		System.out.println(person);

	}

}
