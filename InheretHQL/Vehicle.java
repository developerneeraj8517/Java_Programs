package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy =InheritanceType.JOINED)

//joined , single table, table 
public class Vehicle {
	@Id
	@GeneratedValue
	private Long id;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	@Override
//	public String toString() {
//		return "Vehicle [id="+id+"]";
//	}
	
	
	
	

}
