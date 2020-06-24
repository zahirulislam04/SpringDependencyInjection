package com.spring.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
         
    	ApplicationContext factory = new AnnotationConfigApplicationContext(HouseConfig.class);
    	
    	MyHouse house =  factory.getBean(MyHouse.class);    	
    	house.houseConfig();	
    }
}
