package com.springcore.constructor.injection;

public class Calculator {
	private int a;
	private int b;

	public Calculator(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Calculator double,double");
	}

	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Calculator int,int");
	}

	public Calculator(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Calculator String,String");
	}

	public void doSum() {
		System.out.println("A=" + a);
		System.out.println("B=" + b);
		System.out.println("Total=" + (a + b));
	}
}
