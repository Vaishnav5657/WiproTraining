package com.wipro.datetimedemo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Datetimedemo {

	public static void main(String[] args) {
		/*
		 * LocalDate dt = LocalDate.now(); System.out.println(dt);
		 * 
		 * LocalDate dt1 = LocalDate.of(25, 6, 12); System.out.println(dt1);
		 */
		
		LocalDateTime dm = LocalDateTime.now();
		System.out.println(dm);
	
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
		System.out.println(dm.format(formatter));
		
		

	}

}
