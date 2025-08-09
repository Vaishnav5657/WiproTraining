package com.wipro.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FirstException {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream ("");
			Scanner sc = new Scanner (System.in);
			int y =sc.nextInt(0);
			int x=3/y;
			System.out.println(x);
			
			
		}
		catch (FileNotFoundException ex)
		{
			//ex.printStackTrace();
			System.out.println("File Not Found");
			
		}
		
		catch (ArithmeticException ex)
		{
			//ex.printStackTrace();
			System.out.println("Arithmetic Error");
			
		}
			
		
		
	}

}
