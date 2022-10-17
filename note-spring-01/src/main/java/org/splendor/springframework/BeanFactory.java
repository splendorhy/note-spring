package org.splendor.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author splendor.s
 * @create 2022/10/17 上午10:22
 * @description
 */
public class BeanFactory {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String,BeanDefinition>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }


}
