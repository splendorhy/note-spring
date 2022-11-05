package org.splendor.beans.factory.config;

/**
 * @author splendor.s
 * @create 2022/10/17 下午4:20
 * @description 单例注册表
 */
public interface SingletonBeanRegistry {

    /**
     *  获取单例注册表
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

}
