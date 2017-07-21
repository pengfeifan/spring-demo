package com.github.fly_spring.demo08.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 * 
 * @author william
 *
 */
public class DemoEvent extends ApplicationEvent {

	private static final long servialVersionUID = 1L;
	private String msg;

	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
