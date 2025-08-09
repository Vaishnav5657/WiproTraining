package com.wipro.letsgo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.letsgo.entity.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {

}
