package com.github.fly_spring.demo03.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationSrvc = context.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethodSrvc = context.getBean(DemoMethodService.class);

		demoAnnotationSrvc.add();
		System.out.println("===================");
		demoMethodSrvc.add();

		context.close();
	}
	
	/**
	 * ***************************************
	 	*****DemoAnnotationService.add
		注解式拦截--->[注解式拦截]的add操作
		===================
		方法规则式拦截--->add
		*****DemoMethodService.add
		***************************************
	 */
}
