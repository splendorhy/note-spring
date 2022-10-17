package org.splendor.beans.factory;

import org.splendor.beans.BeansException;

/**
 * @author splendor.s
 * @create 2022/10/17 上午11:06
 * @description
 */
public interface BeanFactory {


    /**
     * 通过名称获取bean
     * @param name
     * @return
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;


}
