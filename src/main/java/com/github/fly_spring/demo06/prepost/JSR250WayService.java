package com.github.fly_spring.demo06.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	public JSR250WayService() {
		System.out.println("constructor-->JSR250WayService");
	}

	@PostConstruct //在构造函数执行完之后执行
	public void init() {
		System.out.println("jsr250-init-method");
	}

	@PreDestroy //在Bean销毁之前执行
	public void destroy() {
		System.out.println("jsr250-destory-method");
	}

}
