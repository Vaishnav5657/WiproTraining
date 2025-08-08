package com.wipro.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo {

	public static void main(String[] args) {
		 
		List<String> names = Arrays.asList("Jayanta", "Jnanedra", "Amit", "Raja", "Anjana", "JAson", "Vijay");

		List<String> filteredNames = names.stream()
		            .filter(name -> name.toLowerCase().contains("ja"))
		            .collect(Collectors.toList());

		 System.out.println("Names in 'j' and 'a' appear consecutively:" + filteredNames);
		 //filteredNames.forEach(System.out::println);
	}
}

