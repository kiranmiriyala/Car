package com.ibm.car.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.car.model.GetCarResponse;
import com.ibm.car.model.Car;
import com.ibm.car.repository.CarRepository;

@Service
@Transactional
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarRepository carRepository;

	public void createCar(Car car) {

		carRepository.save(car);
	}

	public GetCarResponse getAllCar() {

		GetCarResponse patietData = new GetCarResponse();
		patietData.setCars((List<Car>) carRepository.findAll());
		return patietData;
	}

	public Optional<Car> findCarById(String id) {
		return carRepository.findById(id);
	}

	public void update(Car newCar, String id) {

		Optional<Car> car = carRepository.findById(id);
		Car car_obj = new Car();
		if (car != null && car.isPresent()) {
			car_obj.setName(newCar.getName());
			//car_obj.setMobile(newCar.getMobile());
			car_obj.setId(newCar.getId());
			carRepository.save(car_obj);
		}

	}

	public void deleteCarById(String id) {
		carRepository.deleteById(id);
	}

}
