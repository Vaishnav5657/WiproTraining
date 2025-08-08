package com.tcs.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.employee.entity.*;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
