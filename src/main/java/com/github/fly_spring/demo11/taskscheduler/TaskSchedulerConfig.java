package com.github.fly_spring.demo11.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 配置类
 * 通过@EnableScheduling注解开启对计划任务的支持
 * @author william
 *
 */
@Configuration
@ComponentScan("com.github.fly_spring.demo11.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
