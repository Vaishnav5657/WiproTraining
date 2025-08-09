package com.wipro.exception;

public class Throwdemo {

	public static void main(String[] args) {
		System.out.println(staticaddString,"Jaynta", "");
		

	}
	
	static String staticaddString(String strng1, String string2)
	{
		if(strng1.isBlank() || string2.isBlank())
		{
			throw new RuntimeException("Empty sttring");
		}
		return strng1+" "+string2;
	}

}
