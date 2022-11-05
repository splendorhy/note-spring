package org.splendor.beans.factory;

import org.splendor.beans.BeansException;

/**
 * @author splendor.s
 * @create 2022/10/17 下午4:16
 * @description
 */
public interface BeanFactory {

    /**
     * 通过名称获取实例
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * 通过多参数获取实例
     * @param beanName
     * @param args
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName, Object... args) throws  BeansException;

}
