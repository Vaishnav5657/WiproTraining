package com.wipro.oop;

public class Bird extends Animal {
	    Bird(String name) {
	        super(name);
	    }

	    @Override
	    void makeSound() {
	        System.out.println(name + " chirps: Tweet Tweet!");
	    }
	}

