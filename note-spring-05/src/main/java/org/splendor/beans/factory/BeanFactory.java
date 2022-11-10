package org.splendor.beans.factory;

import org.splendor.beans.BeansException;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:41
 * @description
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws  BeansException;

}
