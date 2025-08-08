package com.wipro.weather.weather.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.wipro.weather.weather.controller.repo.MobileRepo;
import com.wipro.weather.weather.dto.MobileDto;
import com.wipro.weather.weather.service.MobileService;


public class Mobileimpl implements MobileService{

		@Autowired
		MobileRepo mobileRepo;

		@Override
		public void save(MobileDto mobile) {
			// TODO Auto-generated method stub
			mobileRepo.save(mobile);
			
			
		}

		@Override
		public MobileDto findById(int id) {
			// TODO Auto-generated method stub
			return mobileRepo.findById(id);
		}

		@Override
		public List<MobileDto> findAll() {
			// TODO Auto-generated method stub
			return mobileRepo.findAll();
		}

		@Override
		public void update(int id, MobileDto mobile) {
			// TODO Auto-generated method stub
			mobileRepo.update(id, mobile);
			
		}

		@Override
		public void delete(int id, MobileDto mobile) {
			// TODO Auto-generated method stub
			mobileRepo.delete(id, mobile);
			
		}
		

	}
