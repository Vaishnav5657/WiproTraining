package com.wipro.weather.weather.service;

import java.util.List;

import com.wipro.weather.weather.dto.MobileDto;

public interface MobileService {
		
		public void save(MobileDto mobile);
		public MobileDto findById(int id);
		public List<MobileDto> findAll();
		public void update(int id, MobileDto mobile);
		public void delete(int id, MobileDto mobile);

	}

