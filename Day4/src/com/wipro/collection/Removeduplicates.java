package com.wipro.collection;
import java.util.*;

public class Removeduplicates {

	public static void main(String[] args) {
		
		        List<String> names = new ArrayList<>();
		        names.add("Apple");
		        names.add("Banana");
		        names.add("Apple");
		        names.add("Orange");
		        names.add("Banana");

		        // Remove duplicates using HashSet
		        Set<String> uniqueSet = new HashSet<>(names);
		        List<String> uniqueList = new ArrayList<>(uniqueSet);

		        System.out.println("List after removing duplicates: " + uniqueList);
		        
		        
/*		        List<Integer> numbers = new ArrayList<>();
		        numbers.add(10);
		        numbers.add(20);
		        numbers.add(10);
		        numbers.add(30);
		        numbers.add(40);
		        numbers.add(20);

		        System.out.println("Original List: " + numbers);

		        // Step 2: Remove duplicates using a Set
		        Set<Integer> uniqueSet = new HashSet<>(numbers);

		        // Step 3: Convert set back to list (if needed)
		        List<Integer> uniqueList = new ArrayList<>(uniqueSet);

		        // Step 4: Print final list
		        System.out.println("List after removing duplicates: " + uniqueList)*/;
		    }
	}
