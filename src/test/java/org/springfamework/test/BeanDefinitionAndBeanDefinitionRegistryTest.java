package org.springfamework.test;

import org.junit.Test;
import org.springfamework.beans.BeansException;
import org.springfamework.beans.factory.config.BeanDefinition;
import org.springfamework.beans.factory.service.impl.HelloServiceImpl;
import org.springfamework.beans.factory.support.DefaultListableBeanFactory;

public class BeanDefinitionAndBeanDefinitionRegistryTest {
    @Test
    public void testBeanFactory()throws BeansException{
        //Bean容器 注册表
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //创建一个beanDefinition包含bean的信息
        BeanDefinition beanDefinition = new BeanDefinition(HelloServiceImpl.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //获取bean
        HelloServiceImpl helloService = (HelloServiceImpl)beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
