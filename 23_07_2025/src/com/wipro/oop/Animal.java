package com.wipro.oop;

public abstract class Animal {
	 String name;

	    // Constructor
	    Animal(String name) {
	        this.name = name;
	    }

	    // Common method
	    void eat() {
	        System.out.println(name + " is eating.");
	    }

	    // Abstract method
	    abstract void makeSound();

}
