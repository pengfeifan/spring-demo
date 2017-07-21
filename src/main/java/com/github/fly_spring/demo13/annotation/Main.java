package com.github.fly_spring.demo13.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService demoSrvc = context.getBean(DemoService.class);
		demoSrvc.printResult();
		context.close();
	}
	/*
	 	从组合注解配置照样获得Bean!
	 */
}
