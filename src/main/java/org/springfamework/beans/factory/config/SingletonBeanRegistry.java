package org.springfamework.beans.factory.config;

/**
 *
 * 定义添加和获取单例bean的方法
 */
public interface SingletonBeanRegistry {
    /**
     * 单例
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
