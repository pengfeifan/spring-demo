package com.github.fly_spring.demo09.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();
		context.close();
	}
	/*
	 Bean的名称是:awareService 
	 ResourceLoader加载的文件内容是:Spring Aware Test!
	 */
}
