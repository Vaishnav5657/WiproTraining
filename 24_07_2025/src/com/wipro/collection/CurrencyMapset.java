package com.wipro.collection;
import java.util.*;


public class CurrencyMapset {

	public static void main(String[] args) {
	
		        // Step 1: Create a HashMap of currency code and name
		        Map<String, String> currencyMap = new TreeMap<>();
		        currencyMap.put("USD", "United States Dollar");
		        currencyMap.put("INR", "Indian Rupee");
		        currencyMap.put("EUR", "Euro");
		        currencyMap.put("JPY", "Japanese Yen");

		        // Step 4: Print entries in format "CODE - Name"
		        for (Map.Entry<String, String> data:currencyMap.entrySet())
		        {
		            System.out.println(data.getKey() + " - " + data.getValue());
		        }
		    }

	}
