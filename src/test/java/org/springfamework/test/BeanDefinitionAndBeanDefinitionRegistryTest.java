package org.springfamework.test;

import org.junit.Test;
import org.springfamework.beans.BeansException;
import org.springfamework.beans.factory.config.BeanDefinition;
import org.springfamework.beans.factory.service.impl.HelloServiceImpl;
import org.springfamework.beans.factory.support.DefaultListableBeanFactory;

public class BeanDefinitionAndBeanDefinitionRegistryTest {
    @Test
    public void testBeanFactory()throws BeansException{
        //Bean���� ע���
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //����һ��beanDefinition����bean����Ϣ
        BeanDefinition beanDefinition = new BeanDefinition(HelloServiceImpl.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //��ȡbean
        HelloServiceImpl helloService = (HelloServiceImpl)beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
