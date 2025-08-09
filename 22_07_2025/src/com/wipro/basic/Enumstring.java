package com.wipro.basic;

public class Enumstring {
	
	enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

	public static void main(String[] args) {
		        
		        // Loop through all Month values using for-each
		        for (Month m : Month.values()) {
		            System.out.println(m);
		        }

		        // Create a variable of type Month and assign FEBRUARY
		        Month month = Month.FEBRUARY;

		        // Check if the month is FEBRUARY
		        if (month == Month.FEBRUARY) {
		            System.out.println("The month is February.");
		        }

	}

}
