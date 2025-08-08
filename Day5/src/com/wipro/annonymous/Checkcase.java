package com.wipro.annonymous;
import java.util.function.Predicate;


public class Checkcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> checkUperLower = str ->{
			if (str.equals(str.toLowerCase())){
				return true;
				
			}
			else {
				return false;
			}
			
		};
		 
			System.out.println(checkUperLower.test("fine"));
	}
}

		
/*
 * Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());
 * 
 * // Predicate to check if a string is in lowercase Predicate<String>
 * isLowerCase = str -> str.equals(str.toLowerCase());
 * 
 * // Test strings String input1 = "HELLO"; String input2 = "hello"; String
 * input3 = "Hello";
 * 
 * System.out.println("\"" + input1 + "\" is uppercase? " +
 * isUpperCase.test(input1)); System.out.println("\"" + input2 +
 * "\" is lowercase? " + isLowerCase.test(input2)); System.out.println("\"" +
 * input3 + "\" is uppercase? " + isUpperCase.test(input3));
 * System.out.println("\"" + input3 + "\" is lowercase? " +
 * isLowerCase.test(input3)); }
 * 
 * }
 */

