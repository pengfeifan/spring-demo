package com.github.fly_spring.demo02.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Run
 * 
 * @author william
 * 使用AnnotationConfigApplicationContext作为[Spring容器]，接受输入一个[配置类]作为参数
 *
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService useFuncSrvc = context.getBean(UseFunctionService.class);

		System.out.println(useFuncSrvc.sayHello("IOC-DI-JavaConfig"));
		context.close();
	}

	/**
	 * 
	 * hello,IOC-DI-JavaConfig!
	 */
}
