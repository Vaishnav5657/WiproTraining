package com.tcs.relation.service;

import java.util.List;

import com.tcs.employee.entity.Employee;

public interface EmployeeService {
	
	void save(Employee employee);
	List<Employee> findAll();

}
