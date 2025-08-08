package com.wipro.annonymous;
import java.util.function.Function;


public class Functiond1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Function<Double, Double> giveFra = num-> (num-Math.floor(num));
		 * System.out.println(giveFra.apply(123.45));
		 */

		       
		  Function<Double, Double> FractionalPart = num -> num - Math.floor(num);
		        
		  double input = 123.45;
		  double fraction = FractionalPart.apply(input);
		  
		  System.out.printf("Fractional part: %.2f", fraction);

		}
	}

