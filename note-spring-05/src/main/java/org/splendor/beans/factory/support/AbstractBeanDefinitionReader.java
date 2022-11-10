package org.splendor.beans.factory.support;

import org.splendor.core.io.DefaultResourceLoader;
import org.splendor.core.io.ResourceLoader;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:52
 * @description
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader  {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader  resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry){
        this(registry,new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry beanDefinitionRegistry, ResourceLoader resourceLoader) {
        this.registry = beanDefinitionRegistry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
