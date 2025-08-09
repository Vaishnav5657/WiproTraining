package com.wipro.thread;

	public class Alphabetthread extends Thread {
	    public void run() {
	        for (char ch = 'A'; ch <= 'J'; ch++) {
	            System.out.println("Letter: " + ch);
	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
