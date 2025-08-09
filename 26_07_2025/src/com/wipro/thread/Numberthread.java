package com.wipro.thread;

	
public class Numberthread extends Thread {
	   public void run() {
	     for (int i = 1; i <= 10; i++) {
	          System.out.println("Number: " + i);
	          try {
	               Thread.sleep(500);
	         } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

