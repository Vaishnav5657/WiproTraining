package com.wipro.oop;

public class Rectangle extends Shapes {

	 private double length;
	 private double width;

	    public Rectangle(String color, double length, double width) {
	        super(color);
	        this.length = length;
	        this.width = width;
	    }

	    public double getLength() {
	        return length;
	    }

	    public double getWidth() {
	        return width;
	    }

	    @Override
	    public String toString() {
	        return "Rectangle [length=" + length + ", width=" + width + ", " + super.toString() + "]";
	    }
	}
