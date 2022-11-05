package org.splendor.beans.factory;

import org.splendor.beans.BeansException;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:44
 * @description
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws  BeansException;

}
