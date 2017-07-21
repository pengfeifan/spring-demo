package com.github.fly_spring.demo12.conditional;

/**
 * Windows下要创建的Bean类
 * @author william
 *
 */
public class WindowsListService implements ListService{

	@Override
	public String showListCmd() {
		return "dir";
	}

}
