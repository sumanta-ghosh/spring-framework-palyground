package com.aop.services;

public class Upi implements PaymentService {

	@Override
	public void makePayment() {
		System.out.println("==================");
		System.out.println("UPI Payment");
		System.out.println("==================");

		System.out.println("Amount debited....");
		System.out.println("Amount credited....");
	}

}