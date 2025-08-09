package com.wipro.letsgo.service;

import java.util.List;
import com.wipro.letsgo.entity.Vehicle;

public interface VehicleService {
	
		String save(Vehicle letsGo);
		List<Vehicle> findAll();

}
