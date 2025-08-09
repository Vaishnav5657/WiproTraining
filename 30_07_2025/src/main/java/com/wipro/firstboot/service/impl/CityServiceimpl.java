package com.wipro.firstboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.firstboot.repo.Cityrepo;
import com.wipro.firstboot.service.CityService;


@Service
public class CityServiceimpl implements CityService {
	
	@Autowired
	Cityrepo cityRepo;
	
	@Override
	public List<String> getCityList() {
		// TODO Auto-generated method stub
		return cityRepo.getCityList();
	}

}

