package org.splendor.beans.factory.support;

import org.splendor.beans.BeansException;
import org.splendor.beans.factory.BeanFactory;
import org.splendor.beans.factory.config.BeanDefinition;

/**
 * @author splendor.s
 * @create 2022/10/17 上午11:12
 * @description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    /**
     * 获取bean定义
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 构建Bean对象
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
