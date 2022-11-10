package org.splendor.beans.factory.support;

import org.splendor.beans.BeansException;
import org.splendor.core.io.Resource;
import org.splendor.core.io.ResourceLoader;

import java.beans.Beans;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:51
 * @description
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry  getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resource) throws BeansException;

    void loadBeanDefinitions(String beanName) throws BeansException;

}
