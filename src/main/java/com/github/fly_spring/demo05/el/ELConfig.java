package com.github.fly_spring.demo05.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.github.fly_spring.demo05.el")
@PropertySource("classpath:com/github/fly_spring/demo05/el/test.properties")
public class ELConfig {

	@Value("Love Spring Boot") // 1.注入普通字符串
	private String normal;

	@Value("#{systemProperties['os.name']}") // 2.注入操作系统属性
	private String osName;

	@Value("#{ T(java.lang.Math).random() *100.0}") // 3.注入表达式结果
	private double randomNumber;

	@Value("#{demoService.another}") // 4.注入其他Bean属性
	private String fromAnotherClass;

	@Value("classpath:com/github/fly_spring/demo05/el/test.txt") // 5.注入文件资源
	private Resource testFile;

	@Value("https://www.baidu.com/") // 6.注入网址资源
	private Resource testUrl;

	@Value("${test.username}") // 7.注入配置文件
	private String username;

	@Autowired
	private Environment environment; // 7.注入配置文件

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public void outputResource() {
		System.out.println("ELConfig==========");
		try {
			System.out.println("normal-->" + normal);
			System.out.println("osName-->" + osName);
			System.out.println("randomNumber-->" + randomNumber);
			System.out.println("fromAnotherClass-->" + fromAnotherClass);
			System.out.println("testFile-->" + IOUtils.toString(testFile.getInputStream()));
			System.out.println("testUrl-->" + IOUtils.toString(testUrl.getInputStream()));
			System.out.println("username-->" + username);
			System.out.println("passwd-->" + environment.getProperty("test.passwd"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
