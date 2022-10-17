package org.splendor.beans.factory.config;

/**
 * @author splendor.s
 * @create 2022/10/17 上午11:12
 * @description 单例注册表
 */
public interface SingletonBeanRegistry {

    /**
     * 获取类对象单例
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

}
