package org.splendor.beans.factory.support;

import org.splendor.beans.BeansException;
import org.splendor.beans.factory.config.BeanDefinition;

/**
 * @author splendor.s
 * @create 2022/10/17 上午11:12
 * @description
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
