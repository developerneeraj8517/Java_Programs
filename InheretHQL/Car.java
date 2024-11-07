package com.demo;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicle {
	
  private String carName;

public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

@Override
public String toString() {
	return "Car [carName=" + carName + "]";
}
  
}
