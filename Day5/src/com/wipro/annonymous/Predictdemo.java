package com.wipro.annonymous;
import java.util.function.Predicate;

public class Predictdemo {

	public static void main(String[] args) {
				
				Predicate<String> palindromeCheck= str ->{
					String reversed = new StringBuilder(str).reverse().toString();
					return str.equalsIgnoreCase(reversed);
				};
				
				System.out.println(palindromeCheck.test("madam"));

			}
	}

