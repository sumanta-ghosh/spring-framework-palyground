package com.springcore;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);

		Student student4 = (Student) context.getBean("student4");
		System.out.println(student4);

		Student student5 = (Student) context.getBean("student5");
		System.out.println(student5);

		context.close();
	}
}