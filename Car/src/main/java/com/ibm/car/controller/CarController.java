package com.ibm.car.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ibm.car.model.GetCarResponse;
import com.ibm.car.model.Car;
import com.ibm.car.service.CarService;

import io.swagger.annotations.Api;
@RestController
@CrossOrigin(origins="*")
@RequestMapping(value={"/","/car"})
@Api(value="sample", description="SpringBoot CRUD Application with MongoDB")
public class CarController {
	
	@Autowired
	CarService carService;

	 @PostMapping(value="/create/car",headers="Accept=application/json")
	 public ResponseEntity<Void> createCar(@RequestBody Car car, UriComponentsBuilder ucBuilder){
	     carService.createCar(car);
	     HttpHeaders headers = new HttpHeaders();
	     headers.setLocation(ucBuilder.path("/car/{name}").buildAndExpand(car.getName()).toUri());
	     return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	 }

	 @GetMapping(value="/get/car", headers="Accept=application/json")
	 public GetCarResponse getAllCar() {		 
		GetCarResponse carList = carService.getAllCar();
		return carList;
	 }
	 
	 @GetMapping(value="/get/car/{id}", headers="accept=application/json")
	 public Optional<Car> findCarById(@PathVariable("id") String id){
		 Optional<Car> car= carService.findCarById(id);
		 return car;
	 }

	
	  @PutMapping(value="/update/car/{id}", headers="Accept=application/json") 
	  public ResponseEntity<Car> updateCar(@RequestBody Car currentCar,@PathVariable("id") String name) {
		  carService.update(currentCar, name);
		  return new ResponseEntity<Car>(HttpStatus.OK); 
	  }
	  
	  @DeleteMapping(value="/delete/car/{id}", headers ="Accept=application/json") 
	  public ResponseEntity<Car> deleteCar(@PathVariable("id") String id){
		  Optional<Car> car = carService.findCarById(id);
		  if (car == null) { 
			  return new ResponseEntity<Car>(HttpStatus.NOT_FOUND); 
		  } 
		  carService.deleteCarById(id);
		  return new ResponseEntity<Car>(HttpStatus.NO_CONTENT); 
	  }
	 


}
