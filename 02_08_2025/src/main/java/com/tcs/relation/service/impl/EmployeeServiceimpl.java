package com.tcs.relation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employee.entity.Employee;
import com.tcs.relation.repo.EmployeeRepo;
import com.tcs.relation.service.EmployeeService;


@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo empRepo;

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		empRepo.save(employee);		
	}

	@Override
	public List<Employee> findAll() {
		
		return empRepo.findAll();
	}
	}