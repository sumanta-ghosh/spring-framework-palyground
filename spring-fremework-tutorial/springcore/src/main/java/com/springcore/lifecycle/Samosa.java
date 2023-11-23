package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside default constructor method...");
	}

	public double getPrice() {
		System.out.println("Inside getPrice method...");
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Inside setPrice method...");
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("Inside toString method...");
		return "Samosa [price=" + price + "]";
	}

	public void init() {
		System.out.println("Inside init method...");
	}

	public void destroy() {
		System.out.println("Inside destroy method...");
	}
}
