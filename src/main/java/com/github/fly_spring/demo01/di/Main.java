package com.github.fly_spring.demo01.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Run
 * 
 * @author william 
 * 使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个[配置类]作为参数
 * 获得声明配置的UseFunctionService的Bean
 *
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFuncSrvc = context.getBean(UseFunctionService.class);

		System.out.println(useFuncSrvc.sayHello("IOC-DI"));
		context.close();
	}

	/**
	 * 
	 * hello,IOC-DI!
	 */
}
