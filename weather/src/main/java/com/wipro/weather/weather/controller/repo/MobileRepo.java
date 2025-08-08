package com.wipro.weather.weather.controller.repo;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.wipro.weather.weather.dto.MobileDto;


@Repository
public class MobileRepo {

		
		 List<MobileDto> mobileList = new ArrayList<>();

		    public void save(MobileDto mobile) {
		    	mobileList.add(mobile);
		    }

		    public MobileDto findById(int id) {
		        return mobileList.get(id);
		    }

		    public List<MobileDto> findAll() {
		        return mobileList;
		    }

		    public void update(int id, MobileDto mobile) {
		    	int i=0;
		    	for(MobileDto m:mobileList) {
		    		if(m.getId()==mobile.getId()) {
		    			mobileList.add(i, m);
		    		}
		    		i++;
		    }
		    }

		    	public void delete(int id, MobileDto mobile) {
			    	int i=0;
			    	for(MobileDto m:mobileList) {
			    		if(m.getId()==mobile.getId()) {
			    			mobileList.remove(i);
			    		}
			    		i++;
			    }
		}

	}
