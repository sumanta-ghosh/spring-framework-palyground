package com.springcore.bean.scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	@Value("Sumanta")
	private String name;

	@Value("2023-24")
	private String session;

	@Value("#{studentPhones}")
	private List<String> mobiles;

	public Student() {
		super();
		System.out.println("Call deafult constructor in student...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public List<String> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<String> mobiles) {
		this.mobiles = mobiles;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", session=" + session + ", mobiles=" + mobiles + "]";
	}

}
