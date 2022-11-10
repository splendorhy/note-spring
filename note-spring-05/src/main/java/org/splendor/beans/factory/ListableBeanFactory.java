package org.splendor.beans.factory;

import org.splendor.beans.BeansException;

import java.util.Map;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:44
 * @description
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     *  按类型返回Bean实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
     <T> Map<String, T> getBeanOfType(Class<T> type) throws BeansException;

     /**
      * 返回注册表中国所有的Bean的名称
      * @return
      */
     String[] getBeanDefinitionNames();

}
