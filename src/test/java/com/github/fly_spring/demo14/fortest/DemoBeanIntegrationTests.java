package com.github.fly_spring.demo14.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 1.SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework的功能
 * 2.@ContextConfiguration用来加载配置ApplicationContext,其中classes属性用来加载配置类
 * 3.@ActiveProfiles用来声明活动的profile 
 * 4.可使用普通的@Autowired注入Bean
 * 5.测试代码，通过JUnit的Assert来校验结果是否和语气一致
 * 
 * @author william
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) // 1
@ContextConfiguration(classes = { TestConfig.class }) // 2
@ActiveProfiles("prod") // 3
public class DemoBeanIntegrationTests {

	@Autowired // 4
	private TestBean testBean;

	@Test // 5
	public void testProdBeanShouldInject() {
		String expected = "from production profile.";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}
}
