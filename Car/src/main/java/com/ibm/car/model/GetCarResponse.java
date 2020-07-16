package com.ibm.car.model;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCarResponse {
	
	 @JsonProperty("cars")
	  private List<Car> cars = new ArrayList<Car>();

	  public GetCarResponse cars(List<Car> cars) {
	    this.cars = cars;
	    return this;
	  }

	  public GetCarResponse addCars(Car Car) {
	    this.cars.add(Car);
	    return this;
	  }

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}


}
