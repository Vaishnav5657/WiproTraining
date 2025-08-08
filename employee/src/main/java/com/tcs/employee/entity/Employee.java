package com.tcs.employee.entity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Table(name = "employee")
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		
		@Column(name = "emp_name")
		String employeeName;
		
		@Column(name = "emp_id")
		String empId;
		
		@Column(name = "dept_name")
		String departmentName;
		
		@OneToOne(cascade=CascadeType.ALL)
		Department department;

	}
	