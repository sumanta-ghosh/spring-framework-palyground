package com.aop.services;

public class Paypal implements PaymentService {

	@Override
	public void makePayment() {
		System.out.println("==================");
		System.out.println("PayPal Payment");
		System.out.println("==================");

		System.out.println("Amount debited....");
		System.out.println("Amount credited....");
	}

}
