package org.splendor.beans.factory.config;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:44
 * @description 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
