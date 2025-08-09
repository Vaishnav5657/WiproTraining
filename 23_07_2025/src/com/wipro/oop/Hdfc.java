package com.wipro.oop;
		
public class Hdfc implements BankOps {

		@Override
		public void deposite(double amount, String accNumber) {
			System.out.println("Depositing money in your hdfc account");
			
		}

		@Override
		public double withdraw(double amount, String accNumber) {
			System.out.println("Taking money from Citi bank");
			return 0;
		}
}

