package com.wipro.annonymous;

public  class Bankdemo implements Bankops {
	

    // Anonymous inner class for Savings Account
    Bankops savings = new BankOps() {
    	
        @Override
        public void deposit(double amount) {
            System.out.println("Depositing ₹" + amount + " in Savings Account");
        }
    };

    // Anonymous inner class for Current Account
    Bankops current = new BankOps() {
    	
        @Override
        public void deposit(double amount) {
            System.out.println("Depositing ₹" + amount + " in Current Account");
        }
    };

    // Call deposit method
     savings.deposit(5000);
     current.deposit(10000);
}

