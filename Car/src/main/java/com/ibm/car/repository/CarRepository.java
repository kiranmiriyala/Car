package com.ibm.car.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.car.model.Car;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {

}
