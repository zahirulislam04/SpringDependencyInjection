package com.spring.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyHouse {
	@Autowired
	@Qualifier("woodenHouse")
	House house;
	
	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public void houseConfig() {
		System.out.println("two storeyed house with 5 bedrooms, 2 guest rooms and 3 washrooms");
		buildHouse();
	}
	
	public void buildHouse() {
		house.buildPillar();
		house.buildWall();
	}
}
