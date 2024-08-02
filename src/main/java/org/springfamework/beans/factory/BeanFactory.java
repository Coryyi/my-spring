package org.springfamework.beans.factory;

import org.springfamework.beans.BeansException;

/**
 * bean工厂 定义获取bean的接口
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
