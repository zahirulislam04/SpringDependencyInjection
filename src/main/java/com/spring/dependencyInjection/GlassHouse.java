package com.spring.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class GlassHouse implements House {

	public void buildWall() {
		System.out.println("Glass wall is built");	
	}

	public void buildPillar() {
		System.out.println("Concrete pillar is built for glass house");

	}

}
