package com.springcore.reference;

public class A {
	private int x;
	private B refObj;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A(int x, B refObj) {
		super();
		this.x = x;
		this.refObj = refObj;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getRefObj() {
		return refObj;
	}

	public void setRefObj(B refObj) {
		this.refObj = refObj;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", refObj=" + refObj + "]";
	}

}
