package com.github.fly_spring.demo08.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 * 实现ApplicationListener接口，并指定监听的事件类型
 * 使用onApplicationEvent方法对消息进行接受处理
 * @author william
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("beanListener received beanPublisher message:" + msg);
	}

}
