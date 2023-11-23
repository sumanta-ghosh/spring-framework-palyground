package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLifecycle {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle-config.xml");
		ctx.registerShutdownHook();
		
		Samosa samosa = (Samosa) ctx.getBean("samosa");
		System.out.println(samosa.getPrice());

		// ctx.close();

		System.out.println("Call after close");

	}

}
