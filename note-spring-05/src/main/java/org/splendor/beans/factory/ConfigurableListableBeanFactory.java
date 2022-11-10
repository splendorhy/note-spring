package org.splendor.beans.factory;

import org.splendor.beans.factory.config.AutowireCapableBeanFactory;
import org.splendor.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:43
 * @description
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
}
