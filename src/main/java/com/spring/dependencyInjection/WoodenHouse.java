package com.spring.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class WoodenHouse implements House {

	public void buildWall() {
		System.out.println("Wooden wall is built");

	}

	public void buildPillar() {
		System.out.println("Wooden pillar is built for wooden house");

	}

}
