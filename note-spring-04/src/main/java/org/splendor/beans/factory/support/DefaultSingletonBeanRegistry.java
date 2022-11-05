package org.splendor.beans.factory.support;

import org.splendor.beans.factory.config.SingletonBeanRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:45
 * @description
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object>  singletonObjects = new ConcurrentHashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected  void addSingleton(String beanName , Object singletonObject){
        singletonObjects.put(beanName, singletonObject);
    }

}
