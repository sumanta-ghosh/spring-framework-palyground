package com.springcore.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("address2")
	private Address address;

	private String name;

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Employee constructor");
	}

	public Employee(Address address, String name) {
		super();
		this.address = address;
		this.name = name;
		System.out.println("Inside Employee 2nd constructor");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside Employee default constructor");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Inside setAddress");
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", name=" + name + "]";
	}

}
