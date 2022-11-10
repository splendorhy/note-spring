package org.splendor.beans.factory.config;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:46
 * @description 单例注册表
 */
public interface SingletonBeanRegistry {

    /**
     * 通过名称从注册表中获取实例
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

}
