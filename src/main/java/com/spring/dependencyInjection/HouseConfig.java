package com.spring.dependencyInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.dependencyInjection")
public class HouseConfig {
//	@Bean
//	public MyHouse getHouse() {
//		return new MyHouse();
//	}
//	
//	@Bean
//	public House getHouseType() {
//		return new GlassHouse();
//	}
}
