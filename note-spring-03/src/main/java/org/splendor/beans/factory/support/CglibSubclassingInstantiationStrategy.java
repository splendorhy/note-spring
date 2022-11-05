package org.splendor.beans.factory.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.splendor.beans.BeansException;
import org.splendor.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author splendor.s
 * @create 2022/10/17 下午4:21
 * @description
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if(null == ctor){
            return enhancer.create();
        }
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
