package com.wipro.carms.service;

import java.util.List;
import com.wipro.carms.entity.Car;

public interface CarService {
	    //Car saveCar(Car car);
	    String save(Car car);
	    //List<Car> getAllCars();
	    List<Car> findAll();
	    //Car updateCar(int id, Car updatedCar);
	    String update(int id, Car car);
	    //void deleteCar(int id);
	    String delete(int id);

}
