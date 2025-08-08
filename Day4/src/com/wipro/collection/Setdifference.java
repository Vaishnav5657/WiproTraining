package com.wipro.collection;
import java.util.HashSet;
import java.util.Set;

public class Setdifference {

	public static void main(String[] args) {
		
		       
		        Set<Integer> set1 = new HashSet<>();
		        set1.add(1);
		        set1.add(2);
		        set1.add(3);
		    
		        Set<Integer> set2 = new HashSet<>();
		        set2.add(2);
		        set2.add(3);
		        set2.add(4);
		        
		        set1.removeAll(set2);
				System.out.println(set1);


		     
				/*
				 * Set<Integer> difference = new HashSet<>(set1); 
				 * difference.removeAll(set2);
				 * 
				 * System.out.println("Difference " + difference);
				 */
		    }

	}

