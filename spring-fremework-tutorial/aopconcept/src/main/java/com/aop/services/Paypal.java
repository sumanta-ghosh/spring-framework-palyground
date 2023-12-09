package com.aop.services;

public class Paypal implements PaymentService {

	@Override
	public void makePayment(int amount) {
		System.out.println("==================");
		System.out.println("PayPal Payment");
		System.out.println("==================");

		System.out.println(amount + " Amount debited....");
		System.out.println(amount + " Amount credited....");
	}

}
