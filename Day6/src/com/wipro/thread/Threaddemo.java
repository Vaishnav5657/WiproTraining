package com.wipro.thread;

public class Threaddemo {

	public static void main(String[] args) {
		        Numberthread numberThread = new Numberthread();
		        Alphabetthread alphabetThread = new Alphabetthread();

		        numberThread.start();
		        alphabetThread.start();

	}

}
