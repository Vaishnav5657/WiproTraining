package com.wipro.thread;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Logodemo {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				
				String inputFile = "https://tse2.mm.bing.net/th/id/OIP._Lm_T3scKhVEVFC54gcRxwHaE8?pid=Api&P=0&h=180";
				String outputFile = "https://tse2.mm.bing.net/th/id/OIP._Lm_T3scKhVEVFC54gcRxwHaE8?pid=Api&P=0&h=1801";
				try {
				FileInputStream fi = new FileInputStream(inputFile);
				FileOutputStream fo = new FileOutputStream(outputFile);
				
				
				byte[] buffer = new byte[1024];
				int byteRead = 0;
				try {
					while((byteRead = fi.read(buffer))!=-1) {
						fo.write(buffer,0,byteRead);
					}
			
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}

	}
