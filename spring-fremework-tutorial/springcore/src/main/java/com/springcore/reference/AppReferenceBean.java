package com.springcore.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppReferenceBean {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("reference-config.xml");
		A aObjBean = (A) ctx.getBean("aBean");
		System.out.println(aObjBean);
		ctx.close();
	}
}
