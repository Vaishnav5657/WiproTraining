package com.wipro.annonymous;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class Functionstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList = Arrays.asList("Vaishnav", "Atharv", "rohan");
		Function<List<String>, List<Integer>> countLenght = list->{
			List<Integer> n = new ArrayList();
			for(String s:nameList) {
				n.add(s.length());
			}
			return n;
		};
		System.out.println(countLenght.apply(nameList));
		}
}
