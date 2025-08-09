package com.wipro.oop;

public interface MobileOps {
	//all function in an interface
	//Are abstract and public
	void makeCall(String PhoneNumber);
	void takephoto();
	void turnOnwifi();
	
	default void sleep()
	{
		System.out.println("default");
	}
	
	
	
	

}
