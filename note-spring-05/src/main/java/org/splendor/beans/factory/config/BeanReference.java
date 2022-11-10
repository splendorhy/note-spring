package org.splendor.beans.factory.config;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:45
 * @description bean的引用
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName){
        this.beanName = beanName;
    }

    public String getBeanName(){
        return beanName;
    }

}
