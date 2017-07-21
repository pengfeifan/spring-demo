package com.github.fly_spring.demo13.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void printResult(){
		System.out.println("从组合注解配置照样获得Bean!");
	}
}
