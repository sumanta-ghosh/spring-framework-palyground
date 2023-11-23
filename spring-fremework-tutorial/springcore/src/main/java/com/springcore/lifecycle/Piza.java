package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Piza {
	private double price;

	public Piza(double price) {
		super();
		this.price = price;
	}

	public Piza() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Piza [price=" + price + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("Init from Piza");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy from Piza");
	}

}
