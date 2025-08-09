package com.wipro.annonymous;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.function.Supplier;



public class Tomorrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        // Supplier for tomorrow's day (full name)
		        Supplier<String> tomorrowFullDay = () -> 
		            LocalDate.now().plusDays(1).getDayOfWeek()
		                      .getDisplayName(TextStyle.FULL, Locale.ENGLISH);

		        // Supplier for tomorrow's day (short name, e.g. Mon, Tue)
		        Supplier<String> tomorrowShortDay = () -> 
		            LocalDate.now().plusDays(1).getDayOfWeek()
		                      .getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

		        System.out.println("Tomorrow is: " + tomorrowFullDay.get());   // Example: Friday
		        System.out.println("Short form: " + tomorrowShortDay.get());   // Example: Fri
		    }

	}
