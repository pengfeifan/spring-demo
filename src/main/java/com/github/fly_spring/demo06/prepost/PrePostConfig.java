package com.github.fly_spring.demo06.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * initMethod和destroyMethod指定BeanWayService类的init和destroy方法在构造之后、bean销毁之前执行
 * @author william
 *
 */
@Configuration
@ComponentScan("com.github.fly_spring.demo06.prepost")
public class PrePostConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}

	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
}
