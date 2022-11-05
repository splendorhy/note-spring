package org.splendor.beans.factory.support;

import org.splendor.beans.BeansException;
import org.splendor.beans.factory.BeanFactory;
import org.splendor.beans.factory.config.BeanDefinition;

/**
 * @author splendor.s
 * @create 2022/10/17 下午4:21
 * @description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        return doGetBean(beanName, args);
    }
    
    protected <T> T doGetBean(final String beanName, final Object[] args){
        Object bean = getSingleton(beanName);
        if(bean != null){
            return (T) bean;
        }
        BeanDefinition beanDefinition =  getBeanDefinition(beanName);
        return (T) creatBean(beanName, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract  Object creatBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}
