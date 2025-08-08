package com.wipro.collection;
import java.util.ArrayList;



public class ArrayListdemo{
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	
	for(int i=0;i<5;i++)
	{
		list.add(i);
	}
	
	System.out.println(list);
	list.remove(2);
	list.add(1);
	System.out.println(list);;

}

}

