package com.wipro.letsgo.controller;

import com.wipro.letsgo.entity.Vehicle;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.letsgo.service.VehicleService;


@RestController
@RequestMapping("/move")
public class VehicleController {

		
		@Autowired
		VehicleService vehicleService;
		
		@PostMapping
		public String save(@RequestBody Vehicle letsGo) {
			return vehicleService.save(letsGo);
			
		}
		
		@GetMapping
		public List<Vehicle> findAll(){
			return vehicleService.findAll();
		}

	}