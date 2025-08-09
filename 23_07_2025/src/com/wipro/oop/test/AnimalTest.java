package com.wipro.oop.test;


public class AnimalTest {
	    public static void main(String[] args) {
	        Human human = new Human("Alice");
	        Dog dog = new Dog("Bruno");
	        Bird bird = new Bird("Tweety");

	        human.eat();
	        human.makeSound();

	        dog.eat();
	        dog.makeSound();

	        bird.eat();
	        bird.makeSound();
	    }
	}
