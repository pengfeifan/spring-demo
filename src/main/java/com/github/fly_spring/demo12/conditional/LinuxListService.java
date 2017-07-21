package com.github.fly_spring.demo12.conditional;

/**
 * Linux下要创建的Bean类
 * @author william
 *
 */
public class LinuxListService implements ListService{

	@Override
	public String showListCmd() {
		return "ls";
	}

}
