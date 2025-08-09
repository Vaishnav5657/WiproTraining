package com.wipro.thread;

public interface Payment {
	    void makePayment(double amount);
	}

	// 2. Low-level Modules: Concrete Implementations

	class GooglePay implements Payment {
	    public void makePayment(double amount) {
	        System.out.println("Payment of " + amount + " via GooglePay.");
	    }
	}

	class PhonePe implements Payment {
	    public void makePayment(double amount) {
	        System.out.println("Payment of " + amount + " via PhonePe.");
	    }
	}

	class Paytm implements Payment {
	    public void makePayment(double amount) {
	        System.out.println("Payment of " + amount + " via Paytm.");
	    }
	}

	// 3. High-level Module: PaymentProcessor
	class PaymentProcessor {
	    private Payment payment;

	    // Constructor Injection (DIP)
	    public PaymentProcessor(Payment payment) {
	        this.payment = payment;
	    }

	    public void process(double amount) {
	        payment.makePayment(amount);
	    }
	}
