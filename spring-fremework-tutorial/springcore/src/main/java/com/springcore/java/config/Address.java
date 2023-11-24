package com.springcore.java.config;

public class Address {

	// @Value("Kolkata")
	private String city;

	public Address(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
