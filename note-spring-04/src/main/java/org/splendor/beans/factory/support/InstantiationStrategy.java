package org.splendor.beans.factory.support;

import org.splendor.beans.BeansException;
import org.splendor.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:46
 * @description Bean 实例化策略
 */
public interface InstantiationStrategy {

    /**
     * 实例策略实现类
     * @param beanDefinition
     * @param beanName
     * @param ctor
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
