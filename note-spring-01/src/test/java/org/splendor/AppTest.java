package org.splendor;

import org.junit.Test;
import org.splendor.bean.UserService;
import org.splendor.springframework.BeanDefinition;
import org.splendor.springframework.BeanFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
