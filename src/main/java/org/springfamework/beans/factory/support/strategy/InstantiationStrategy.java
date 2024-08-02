package org.springfamework.beans.factory.support.strategy;

import org.springfamework.beans.BeansException;
import org.springfamework.beans.factory.config.BeanDefinition;

/**
 * Bean实例化策略
 */

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
