package com.github.fly_spring.demo03.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截类
 * 
 * @author william
 *
 */
@Service
public class DemoAnnotationService {

	@Action(name = "[注解式拦截]的add操作")
	public void add() {
		System.out.println("*****DemoAnnotationService.add");
	}
}
