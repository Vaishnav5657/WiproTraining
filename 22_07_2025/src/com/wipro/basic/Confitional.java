package com.wipro.basic;

public class Confitional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl + space - to generate public static void main
		
		/*
		 * boolean flag = false;
		 * 
		 * if(flag==true) 
		 * { System.out.println("True");
		 *  } 
		 *  else 
		 *  {
		 * System.out.println("False");
		 *  }
		 */
		
/*		// Variable to hold the shape code
        char shape = 'S';  // You can change this to 'C', 'S', or any other letter

        // Check the value using if-else
        if (shape == 'R') {
            System.out.println("Rectangle");
            
        } else if (shape == 'C') {
            System.out.println("Circle");
            
        } else if (shape == 'S') {
            System.out.println("Square");
            
        } else {
            System.out.println("Other");*/
            
            
            char shape = 'o';

            switch (shape) {
                case 'R':
                    System.out.println("Rectangle");
                    break;

                case 'C':
                    System.out.println("Circle");
                    break;

                case 'S':
                    System.out.println("Square");
                    break;

                default:
                    System.out.println("Other");
                    break;
            }
        }
        
}

