package com.wipro.oop;

public class Shapes {
		    private String color;

		    // Constructor
		    public Shapes(String color) {
		        this.color = color;
		    }

		    // Getter and Setter
		    public String getColor() {
		        return color;
		    }

		    public void setColor(String color) {
		        this.color = color;
		    }

		    // toString
		    @Override
		    public String toString() {
		        return "Shape [color=" + color + "]";
		    }

	}

