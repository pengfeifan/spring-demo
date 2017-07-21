package com.github.fly_spring.demo07.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("prod"); //将活动的Profile设置为prod
		context.register(ProfileConfig.class); //后置注册Bean配置类，不然会报Bean未定义的异常
		context.refresh(); //刷新容器

		DemoBean demoBean = context.getBean(DemoBean.class);

		System.out.println("content:" + demoBean.getContent());

		context.close();
	}
	/*
	 * content:from production profile.
	 */
}
