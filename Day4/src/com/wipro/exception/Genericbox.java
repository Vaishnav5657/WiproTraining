package com.wipro.exception;
	
	// Generic Box class
	public class Genericbox<T> {
	    private T item;

	    // Method to add item
	    public void setItem(T item) {
	        this.item = item;
	    }

	    // Method to get item
	    public T getItem() {
	        return item;
	    }
	}
