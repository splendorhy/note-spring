package org.splendor.beans.factory.support;

import org.splendor.beans.BeansException;
import org.splendor.beans.factory.BeanFactory;
import org.splendor.beans.factory.config.BeanDefinition;

import java.util.Optional;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:45
 * @description BeanDefinition注册表接口
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name,args);
    }

    private <T> T doGetBean(final String name, final Object[] args) throws BeansException{
        Object bean =  getSingleton(name);
        if(Optional.ofNullable(bean).isPresent()){
            return (T) bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected  abstract  Object createBean(String name, BeanDefinition beanDefinition, Object[] args)throws BeansException;;
}
