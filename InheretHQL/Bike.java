package com.demo;

import javax.persistence.Entity;

@Entity
public class Bike extends Vehicle {

	private String bikeName;

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + "]";
	}
	
}
