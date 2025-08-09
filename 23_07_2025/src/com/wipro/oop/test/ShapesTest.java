package com.wipro.oop.test;

public class ShapesTest {
	 public static <Square, Circle, Rectangle> void main(String[] args) {
	        Circle c = new Circle("Red", 5.5);
	        Rectangle r = new Rectangle("Blue", 10, 4);
	        Square s = new Square("Green", 6);

	        System.out.println(c);
	        System.out.println(r);
	        System.out.println(s);
	    }
	}

