package com.springcore.constructor.injection;

public class Certi {
	private String name;

	public Certi(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}
}
