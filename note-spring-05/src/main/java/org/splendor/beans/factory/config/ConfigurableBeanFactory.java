package org.splendor.beans.factory.config;

import org.splendor.beans.factory.HierarchicalBeanFactory;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:46
 * @description
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

}
