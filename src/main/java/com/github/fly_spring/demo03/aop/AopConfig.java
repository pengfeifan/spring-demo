package com.github.fly_spring.demo03.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 * 
 * @author william
 *
 */
@Configuration
@ComponentScan("com.github.fly_spring.demo03.aop")
@EnableAspectJAutoProxy // 开启对AspectJ自动代理的支持
public class AopConfig {

}
