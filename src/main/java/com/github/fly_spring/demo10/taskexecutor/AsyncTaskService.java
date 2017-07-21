package com.github.fly_spring.demo10.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 任务执行类
 * 通过[@Async]注解表明该方法是个异步方法，如果注解在类级别，则表明该类所有的方法都是异步方法
 * @author william
 *
 */
@Service
public class AsyncTaskService {

	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务:" + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("执行异步任务+1:" + (i + 1));
	}
}
