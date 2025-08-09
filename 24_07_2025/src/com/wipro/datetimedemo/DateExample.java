package com.wipro.datetimedemo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Month;

public class DateExample {

	public static void main(String[] args) {

		        LocalDate date = LocalDate.of(2023, Month.NOVEMBER, 1);

		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		        String formatdate = date.format(formatter);
		        System.out.println( "Formatted Date " + formatdate);
		    }
		

	}
