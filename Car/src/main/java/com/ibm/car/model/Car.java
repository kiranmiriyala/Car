package com.ibm.car.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "cars")
public class Car {
	
	@Id //It denotes that this is primary key
	@Field(value = "_id")  //It maps JSON property with MongoDB Document Field
	private String id;
	private String name;
	private String speed;
	private String fuel_level;
	private String eng_temp;
	private String coolant_level;
	private String brake_oil_status;
	private String seat_belt_status;
	private String ac_status;
	private String malfunction_status;
	private String location;
	
	/*Constructors*/
	public Car() {

	}

	public Car(String id,String name,String speed,String fuel_level,String eng_temp,String coolant_level,String brake_oil_status,String seat_belt_status,String ac_status,String malfunction_status,String location) {
		this.id=id;
		this.name=name;
		this.speed=speed;
		this.fuel_level=fuel_level;
		this.eng_temp=eng_temp;
		this.coolant_level=coolant_level;
		this.brake_oil_status=brake_oil_status;
		this.seat_belt_status=seat_belt_status;
		this.ac_status=ac_status;
		this.malfunction_status=malfunction_status;
		this.location=location;
	}

	/* Getters and Setters*/
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getFuel_level() {
		return fuel_level;
	}

	public void setFuel_level(String fuel_level) {
		this.fuel_level = fuel_level;
	}

	public String getEng_temp() {
		return eng_temp;
	}

	public void setEng_temp(String eng_temp) {
		this.eng_temp = eng_temp;
	}

	public String getCoolant_level() {
		return coolant_level;
	}

	public void setCoolant_level(String coolant_level) {
		this.coolant_level = coolant_level;
	}

	public String getBrake_oil_status() {
		return brake_oil_status;
	}

	public void setBrake_oil_status(String brake_oil_status) {
		this.brake_oil_status = brake_oil_status;
	}

	public String getSeat_belt_status() {
		return seat_belt_status;
	}

	public void setSeat_belt_status(String seat_belt_status) {
		this.seat_belt_status = seat_belt_status;
	}

	public String getAc_status() {
		return ac_status;
	}

	public void setAc_status(String ac_status) {
		this.ac_status = ac_status;
	}

	public String getMalfunction_status() {
		return malfunction_status;
	}

	public void setMalfunction_status(String malfunction_status) {
		this.malfunction_status = malfunction_status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}		
}
