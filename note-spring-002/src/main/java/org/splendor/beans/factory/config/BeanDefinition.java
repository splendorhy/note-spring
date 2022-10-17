package org.splendor.beans.factory.config;

/**
 * @author splendor.s
 * @create 2022/10/17 上午11:12
 * @description
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
