package com.wipro.rider.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="rider")
@Data
public class Rider {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name = "rider_id")
	int riderId;
	
	@Column(name = "status")
	boolean status;
	
	@Column(name = "vehical_type")
	String vehicalType;
	
	@Column(name = "quantity")
	int quantity;
	
	@Column(name = "pickup_point")
	String pickupPoint;
	
	@Column(name = "destination")
	String destination;

}
