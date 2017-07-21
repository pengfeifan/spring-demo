package com.github.fly_spring.demo09.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * 实现BeanNameAware、ResourceLoaderAware接口，获得Bean名称和资源加载的服务
 * 
 * @author william
 *
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loader;

	// 实现ResourceLoaderAware的setResourceLoader方法
	@Override
	public void setResourceLoader(ResourceLoader loader) {
		this.loader = loader;
	}

	// 实现BeanNameAware的setBeanName方法
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void outputResult() {
		System.out.println("Bean的名称是:" + beanName);
		Resource resource = loader.getResource("classpath:com/github/fly_spring/demo09/aware/test.txt");
		try {
			System.out.println("ResourceLoader加载的文件内容是:" + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
