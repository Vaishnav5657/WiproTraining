package com.wipro.oop;

public class Square extends Shapes {
    public Square(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	private double side;

    public void Square(String color, double side) {
    	super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + ", " + super.toString() + "]";
    }
}
