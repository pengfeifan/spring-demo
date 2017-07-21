package com.github.fly_spring.demo03.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 切面
 * @author william
 * 1.通过@Aspect注解声明一个切面
 * 2.通过@Component注解让此切面成为Spring容器管理的Bean
 * 3.通过@PointCut注解声明切点
 * 4.通过@After注解声明一个建言，并使用@PointCut定义的切点
 * 5.通过反射可获得注解上的属性，然后做日志记录相关的操作，下面7相同
 * 6.通过@Before注解声明一个建言，此建言直接使用拦截规则作为参数
 * 
 */
@Aspect //1
@Component //2
public class LogAspect {

	@Pointcut("@annotation(com.github.fly_spring.demo03.aop.Action)") //3
	public void annotationPointCut() {
	};

	@After("annotationPointCut()") //4
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截--->" + action.name()); //5
	}

	@Before("execution(* com.github.fly_spring.demo03.aop.DemoMethodService.*(..))") //6
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截--->" + method.getName()); //7
	}
}
