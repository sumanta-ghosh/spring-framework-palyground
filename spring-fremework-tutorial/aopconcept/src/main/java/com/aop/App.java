package com.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/aop/app-config.xml");

		PaymentService payment = context.getBean("payment", PaymentService.class);
		payment.makePayment();
	}
}
