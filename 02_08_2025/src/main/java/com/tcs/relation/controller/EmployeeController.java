package com.tcs.relation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.employee.entity.Employee;
import com.tcs.relation.service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
	
		@Autowired
		EmployeeService empService;

		@PostMapping
		void save(Employee employee) {
			empService.save(employee);
		}
		
		@GetMapping
		List<Employee> findAll(){
			return empService.findAll();
			}
	}
	

