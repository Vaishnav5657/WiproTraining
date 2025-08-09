package com.wipro.firstboot.repo;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Cityrepo {
	
		public List<String> getCityList()
		{
			
			return Arrays.asList("Kolhapur","Sangli","Ichalranji","Pune");
		}

}
