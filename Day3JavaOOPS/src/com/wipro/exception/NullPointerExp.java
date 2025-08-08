package com.wipro.exception;

public class NullPointerExp {
	
		public static void main(String[] args) {
	        String fName = null;

	        try {
	            // This will throw NullPointerException
	            String upper = fName.toUpperCase();
	            System.out.println("Uppercase: " + upper);
	        } 
	        
	        catch (NullPointerException e) {
	        System.out.println("Caught NullPointerException: fName is null.");
	        }

	        System.out.println("Program continues after handling exception.");
	    }

	}

