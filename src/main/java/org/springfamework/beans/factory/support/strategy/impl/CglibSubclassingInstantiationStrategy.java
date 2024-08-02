package org.springfamework.beans.factory.support.strategy.impl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springfamework.beans.BeansException;
import org.springfamework.beans.factory.config.BeanDefinition;
import org.springfamework.beans.factory.support.strategy.InstantiationStrategy;

import java.lang.reflect.Method;

/**
 * 使用cglib初始化bean
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                return methodProxy.invokeSuper(o,objects);
            }
        };
        enhancer.setCallback(methodInterceptor);
        return enhancer.create();
    }
}
