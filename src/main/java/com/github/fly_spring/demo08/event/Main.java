package com.github.fly_spring.demo08.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		
		demoPublisher.publish("hello application event!");
		
		context.close();
	}
	/**
	 * beanListener received beanPublisher message:hello application event!
	 */
}
