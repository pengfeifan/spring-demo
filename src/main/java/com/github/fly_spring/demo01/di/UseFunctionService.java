package com.github.fly_spring.demo01.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author william
 * 使用@Service注解声明当前UseFunctionService类是Spring管理的一个Bean
 * 使用@Autowired将FunctionService的实体Bean注入到UseFunctionService中
 */
@Service
public class UseFunctionService {

	@Autowired
	private FunctionService funcService;
	
	public String sayHello(String name){
		return funcService.sayHello(name);
	}
}
