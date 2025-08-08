package com.wipro.oop;

	public class Citi implements BankOps {

		@Override
		public void deposite(double amount, String accNumber) {
			// TODO Auto-generated method stub
			System.out.println("Depositing money in your hdfc account");
			
		}

		@Override
		public double withdraw(double amount, String accNumber) {
			// TODO Auto-generated method stub
			System.out.println("Taking money from Citi bank");
			return 0;
	    }
	}


