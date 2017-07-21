package com.github.fly_spring.demo07.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Profile为dev时实例化devDemoBean
 * Profile为prod时实例化prodDemoBean
 * @author william
 *
 */
@Configuration
public class ProfileConfig {

	@Bean
	@Profile("dev")
	public DemoBean devDemoBean(){
		return new DemoBean("from devlopment profile.");
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean(){
		return new DemoBean("from production profile.");
	}
}
