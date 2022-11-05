package org.splendor.beans.factory.support;

import org.splendor.beans.factory.config.BeanDefinition;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:45
 * @description
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
