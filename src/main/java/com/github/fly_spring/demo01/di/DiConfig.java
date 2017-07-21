package com.github.fly_spring.demo01.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * spring-context 配置类
 * @author william
 * 使用[@Configuration]声明当前类是一个配置类
 * 使用[@ComponentScan]，自动扫描[包名]下所有使用@Service、@Component、@Repository、@Controller的类，并注册为Bean
 * 
 */
@Configuration
@ComponentScan("com.github.fly_spring.demo01.di")
public class DiConfig {

}
