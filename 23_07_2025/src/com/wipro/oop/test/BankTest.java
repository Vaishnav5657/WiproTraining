package com.wipro.oop.test;
import com.wipro.oop.Hdfc;
import com.wipro.oop.Citi;

public class BankTest {

	public static void main(String[] args) {
		Hdfc hdfcuser = new Hdfc();
        Citi citiuser = new Citi();

        hdfcuser.deposite(5000, "442266");
		citiuser.deposite(4000, "45455");
		hdfcuser.withdraw(400, "442266");
		citiuser.withdraw(503, "454555");
        

	}

}
