package com.wipro.thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Executordemo {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		 for (int i = 1; i <= 5; i++)
		 {
		 int taskId = i; // effectively final for lambda or anonymous class
		 executor.submit(() ->{
			 for (int j = 1; j <= 10; j++) {
		     System.out.println("Task " + taskId + " - Number: " + j);
		     
		     try {
		    	 Thread.sleep(1000); // 1 second delay
		         } catch (InterruptedException e) {
		        	 Thread.currentThread().interrupt();
		             System.out.println("Task " + taskId + " interrupted");}
		         }
		        });
		        }
		 // Shutdown executor after task submission
		 executor.shutdown();
		    }
	}

