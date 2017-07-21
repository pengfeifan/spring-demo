package com.github.fly_spring.demo06.prepost;

public class BeanWayService {

	public BeanWayService() {
		System.out.println("constructor-BeanWayService");
	}

	public void init() {
		System.out.println("@Bean-init-method");
	}

	public void destroy() {
		System.out.println("@Bean-destory-method");
	}
}
