package com.github.fly_spring.demo11.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
		System.out.println("Main Thread==========");
	}
	/*
	每隔5秒执行一次:17:34:34
	Main Thread==========
	每隔5秒执行一次:17:34:39
	每隔5秒执行一次:17:34:44
	每隔5秒执行一次:17:34:49
	每隔5秒执行一次:17:34:54
	每隔5秒执行一次:17:34:59
	在指定时间 17:35:00 执行！
	每隔5秒执行一次:17:35:04
	 */
}
