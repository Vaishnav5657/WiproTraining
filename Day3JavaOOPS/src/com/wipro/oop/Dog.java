package com.wipro.oop;

public class Dog extends Animal {
	    Dog(String name) {
	        super(name);
	    }

	    @Override
	    void makeSound() {
	        System.out.println(name + " barks: Woof Woof!");
	    }
	}
