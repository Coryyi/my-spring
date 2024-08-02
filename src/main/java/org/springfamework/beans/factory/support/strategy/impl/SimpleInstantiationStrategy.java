package org.springfamework.beans.factory.support.strategy.impl;

import org.springfamework.beans.BeansException;
import org.springfamework.beans.factory.config.BeanDefinition;
import org.springfamework.beans.factory.support.strategy.InstantiationStrategy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleInstantiationStrategy implements InstantiationStrategy  {
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        // 创建bean的实例
        Class beanClass = beanDefinition.getBeanClass();
        try{
            Constructor declaredConstructor = beanClass.getDeclaredConstructor();
            return declaredConstructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
