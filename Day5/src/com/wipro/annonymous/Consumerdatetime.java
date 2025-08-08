package com.wipro.annonymous;
import java.time.ZonedDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.function.Consumer;

public class Consumerdatetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> currentTime =(time)-> System.out.println(LocalTime.now(ZoneId.of(time)));
		
		currentTime.accept(("Europe/London"));
		
		

	}
}

		/*  Consumer<ZoneId> printTime = zone -> {
		  ZonedDateTime now = ZonedDateTime.now(zone);
		  System.out.println("Current time in " + zone + ": " + now.toLocalTime());
		};
		        
		  printTime.accept(ZoneId.of("Europe/London"));*/


