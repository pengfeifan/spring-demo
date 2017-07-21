package com.github.fly_spring.demo10.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		for(int i=0;i<10;i++){
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
		context.close();
	}
	/*
	 * 
	 执行异步任务:0
	执行异步任务+1:3
	执行异步任务:3
	执行异步任务+1:4
	执行异步任务:4
	执行异步任务+1:5
	执行异步任务:5
	执行异步任务+1:6
	执行异步任务:6
	执行异步任务+1:7
	执行异步任务:7
	执行异步任务+1:8
	执行异步任务:8
	执行异步任务+1:9
	执行异步任务:9
	执行异步任务+1:10
	执行异步任务+1:2
	执行异步任务:1
	执行异步任务+1:1
	执行异步任务:2
	 */
}
