package com.springcore.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.java.config")
public class AppConfig {

	@Bean(name = { "student" })
	public Student getStudent() {
		Student std = new Student();
		return std;
	}

	@Bean("student")
	public Student getStudent2() {
		Student std = new Student();
		return std;
	}

	@Bean(name = "address")
	public Address getAddress() {
		Address add = new Address("Kolkata");
		return add;
	}

	@Bean({ "address2", "address3" })
	public Address getAddress2() {
		Address add = new Address("Delhi");
		return add;
	}
}
