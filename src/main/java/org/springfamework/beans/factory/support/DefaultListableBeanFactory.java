package org.springfamework.beans.factory.support;

import org.springfamework.beans.BeansException;
import org.springfamework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

public class DefaultListableBeanFactory extends AbstractAutowiredCapableBeanFactory implements BeanDefinitionRegistry{

    /**
     * 注册表 存放所有注册过的beanDefinition
     */
    Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String name) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (beanDefinition==null){
            throw new BeansException("No bean named"+name+"is defined");
        }
        return beanDefinition;
    }
}
