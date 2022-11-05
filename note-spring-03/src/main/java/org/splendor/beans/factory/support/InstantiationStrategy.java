package org.splendor.beans.factory.support;

import org.splendor.beans.BeansException;
import org.splendor.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author splendor.s
 * @create 2022/10/17 下午4:22
 * @description
 */
public interface InstantiationStrategy {


    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;


}
