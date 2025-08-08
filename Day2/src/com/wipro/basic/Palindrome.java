package com.wipro.basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Convert to lowercase to ignore case
        String str = input.toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from start and end
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();

	}

}
