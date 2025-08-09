package com.wipro.letsgo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.letsgo.entity.Vehicle;
import com.wipro.letsgo.repo.VehicleRepo;
import com.wipro.letsgo.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleRepo vehicleRepo;


	@Override
	public String save(Vehicle letsGo) {
		// TODO Auto-generated method stub
		vehicleRepo.save(letsGo);
		return "Saved Successfully";
	}
	

	@Override
	public List<Vehicle> findAll() {
		return vehicleRepo.findAll();

	}

}
