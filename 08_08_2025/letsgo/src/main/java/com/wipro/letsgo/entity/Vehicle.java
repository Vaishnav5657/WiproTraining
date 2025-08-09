package com.wipro.letsgo.entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "vehicle_movement")

public class Vehicle {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int id;

	    @Column(name = "vehid")
		int vehId;
		
		@Column(name = "lat")
		double lat;
		
		@Column(name = "longitude")
		double longitude;
	}



