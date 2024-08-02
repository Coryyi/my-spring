package org.springfamework.beans.factory.support;

import org.springfamework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口
 */
public interface BeanDefinitionRegistry {

    /**
     * 像注册表中注入BeanDefinition
     * @param name
     * @param beanDefinition
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
