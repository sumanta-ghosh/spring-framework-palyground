package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{10*5+10}")
	private int x;

	@Value("200")
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;

	@Value("#{ new java.lang.String('Sumanta') }")
	private String name;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", z=" + z + ",name=" + name + "]";
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

}
