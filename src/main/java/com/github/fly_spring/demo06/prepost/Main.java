package com.github.fly_spring.demo06.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		BeanWayService beanWaySrvc = context.getBean(BeanWayService.class);
		System.out.println("------------");
		JSR250WayService jsr250WaySrvc = context.getBean(JSR250WayService.class);
		
		context.close();
	}
	/**
	 ************************************ 
	 	constructor-BeanWayService
		@Bean-init-method
		constructor-->JSR250WayService
		jsr250-init-method
		------------
		jsr250-destory-method
		@Bean-destory-method
	 ************************************
	 */
}
