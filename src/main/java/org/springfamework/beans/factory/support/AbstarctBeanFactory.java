package org.springfamework.beans.factory.support;

import org.springfamework.beans.BeansException;
import org.springfamework.beans.factory.BeanFactory;
import org.springfamework.beans.factory.config.BeanDefinition;

/**
 * BeanFactor抽象类 主要用作其他类的基类
 */
public abstract class AbstarctBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        //从父类SingletonBeanRegistry中调用getSingleton方法获取单例
        //实际由DefaultSingletonBeanRegistry实现
        Object bean = getSingleton(name);
        if (bean!=null){
            return bean;
        }
        //单例注册表中没有创建好的bean实例 这里需要创建bean实例
        //创建bean实例需要知道bean的相关信息，这里至少需要知道什么类，才可以用反射创建实例
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract Object createBean(String name,BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String name) throws BeansException;


}
