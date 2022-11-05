package org.splendor.beans.factory.support;

import org.splendor.beans.factory.config.BeanDefinition;

/**
 * @author splendor.s
 * @create 2022/10/17 下午4:21
 * @description
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
