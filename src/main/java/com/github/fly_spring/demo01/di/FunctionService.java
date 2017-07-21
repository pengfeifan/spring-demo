package com.github.fly_spring.demo01.di;

import org.springframework.stereotype.Service;
/**
 * 
 * @author william
 * 使用@Service注解声明当前FunctionService类是Spring管理的一个Bean
 *
 */
@Service
public class FunctionService {

	public String sayHello(String name) {
		return "hello," + name + "!";
	}
}
