package com.wipro.exceptiontest;


public class Genericboxtest {

		    public static void main(String[] args) {
		        // Box for String
		    	Box<String> stringBox = new Boxtest<>();
		        stringBox.setItem("Hello Generics");
		        System.out.println("String value: " + stringBox.getItem());

		        // Box for Integer
		        Box<Integer> intBox = new Box<>();
		        intBox.setItem(123);
		        System.out.println("Integer value: " + intBox.getItem());

		        // Box for Double
		        Box<Double> doubleBox = new Box<>();
		        doubleBox.setItem(99.99);
		        System.out.println("Double value: " + doubleBox.getItem());
		    }

	}

}
