package org.splendor.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import org.splendor.beans.BeansException;
import org.splendor.beans.PropertyValue;
import org.splendor.beans.PropertyValues;
import org.splendor.beans.factory.config.BeanDefinition;
import org.splendor.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * @author splendor.s
 * @create 2022/10/18 下午8:44
 * @description
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);
            // 给 Bean 填充属性
            applyPropertyValues(beanName, bean, beanDefinition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        addSingleton(beanName, bean);
        return bean;
    }

    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition){
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();

            for(PropertyValue propertyValue :  propertyValues.getPropertyValues()){

                String name = propertyValue.getName();

                Object value = propertyValue.getValue();

                if(value instanceof BeanReference){
                    // A 依赖 B，获取 B 的实例化
                    // A 依赖 B，获取 B 的实例化
                    BeanReference beanReference = (BeanReference) value;
                    value =  getBean(beanReference.getBeanName());
                }
                // 属性填充
                BeanUtil.setFieldValue(bean, name, value);
            }
        } catch (BeansException e) {
            throw new BeansException("Error setting property values：" + beanName);
        }

    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for(Constructor constructor : declaredConstructors){
            if(null != args && constructor.getParameterTypes().length == args.length){
                constructorToUse = constructor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
