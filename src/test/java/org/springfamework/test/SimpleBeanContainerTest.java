package org.springfamework.test;

import org.springfamework.beans.factory.BeanFactory;
import org.springfamework.beans.factory.service.HelloService;
import org.springfamework.beans.factory.service.impl.HelloServiceImpl;
import org.junit.Test;

public class SimpleBeanContainerTest {
    /*@Test
    public void testBeanFactory(){
        BeanFactory beanFactory = new BeanFactory();
        //ע��
        beanFactory.registerBean("helloService",new HelloServiceImpl());
        //��ȡ
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");

        helloService.sayHello();
    }*/
}
