package com.tcs.employee.entity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Table(name = "department")
public class Department {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int id;
		
		@Column(name="department_name")
		String departmentName;
	}

