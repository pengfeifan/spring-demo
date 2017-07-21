package com.github.fly_spring.demo02.javaconfig;


/**
 * 
 * @author william
 * 
 */
public class UseFunctionService {

	private FunctionService funcService;
	
	public void setFunctionService(FunctionService functionService) {
		this.funcService = functionService;
	}
	
	public String sayHello(String name){
		return funcService.sayHello(name);
	}
}
