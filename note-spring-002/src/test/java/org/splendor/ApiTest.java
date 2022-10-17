package org.splendor;

import org.junit.Test;
import org.splendor.beans.UserService;
import org.splendor.beans.factory.config.BeanDefinition;
import org.splendor.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author splendor.s
 * @create 2022/10/17 上午11:15
 * @description
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();
    }

}
