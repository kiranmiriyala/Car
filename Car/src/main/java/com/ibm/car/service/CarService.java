package com.ibm.car.service;
import java.util.Optional;

import com.ibm.car.model.GetCarResponse;
import com.ibm.car.model.Car;

public interface CarService {
	
	public void createCar(Car car);
	
	public GetCarResponse getAllCar();
	
	public Optional<Car> findCarById(String id);
	
	public void update(Car car, String name);
	
	public void deleteCarById(String id);

}
