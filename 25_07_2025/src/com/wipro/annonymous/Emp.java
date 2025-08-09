package com.wipro.annonymous;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Emp {

	public Emp(String string, String string2, int i, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				
				Emp emp1 = new Emp("Atharv","1",23,20000.99);
				Emp emp2 = new Emp("Vinay", "2", 25, 40000.99);
				Emp emp3 = new Emp("Harsh", "21", 62, 60000.99);
				Emp emp4 = new Emp("Shreyash", "4", 26, 50000.99);
				
				List<Emp> empList = new ArrayList<>();
				empList.add(emp1);
				empList.add(emp2);
				empList.add(emp3);
				empList.add(emp4);
				
				Comparator<Emp> SortByempId = (o1, o2)->{
					return o1.compareTo(o2);
				};
				
				Collections.sort(empList, SortByempId);
				System.out.println(empList);
				

			}
	}

