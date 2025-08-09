package com.wipro.basic;

public class Arrayint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {3, 7, 1, 9, 4};

        // Step 2: Double each value using a for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        // Step 3: Print the new values using another for loop
        System.out.println("Doubled array values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
