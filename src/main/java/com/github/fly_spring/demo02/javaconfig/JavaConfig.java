package com.github.fly_spring.demo02.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * spring-context 配置类
 * @author william
 * 使用[@Configuration]声明当前类是一个[配置类]
 * 使用[@Bean]注解在方法上，声明当前方法的返回值为一个Bean
 * 
 */
@Configuration
public class JavaConfig {

	@Bean
	public FunctionService funcSrvc(){
		return new FunctionService();
	}
	
	@Bean
	public UseFunctionService useFuncSrvc(){
		UseFunctionService useFuncSrvc=new UseFunctionService();
		useFuncSrvc.setFunctionService(funcSrvc());
		return useFuncSrvc;
	}
}
