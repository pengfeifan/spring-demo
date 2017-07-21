package com.github.fly_spring.demo03.aop;

import org.springframework.stereotype.Service;

/**
 * 使用方法规则被拦截类
 * 
 * @author william
 *
 */
@Service
public class DemoMethodService {
	public void add() {
		System.out.println("*****DemoMethodService.add");
	}
}
