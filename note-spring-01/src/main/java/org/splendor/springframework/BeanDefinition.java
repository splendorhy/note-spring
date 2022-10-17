package org.splendor.springframework;

/**
 * @author splendor.s
 * @create 2022/10/17 上午10:21
 * @description
 */
public class BeanDefinition {

    private Object bean;

    public Object getBean() {
        return bean;
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
}
