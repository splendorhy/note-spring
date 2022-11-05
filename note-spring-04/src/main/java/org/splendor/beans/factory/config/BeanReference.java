package org.splendor.beans.factory.config;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:44
 * @description Bean 的引用
 */
public class BeanReference {

    private String beanName;

    public BeanReference(String beanName){
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
