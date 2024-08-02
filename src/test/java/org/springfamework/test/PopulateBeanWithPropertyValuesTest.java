package org.springfamework.test;

import org.springfamework.beans.PropertyValue;
import org.springfamework.beans.PropertyValues;
import org.springfamework.beans.factory.config.BeanDefinition;
import org.springfamework.beans.factory.support.DefaultListableBeanFactory;
import org.springfamework.test.bean.Person;

/**
 * 测试给bean填充属性
 */
public class PopulateBeanWithPropertyValuesTest {
    public void testPopulateBeanWithPropertyValues() throws Exception{
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //注册bean 首先构建beanDefinition
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name","CAROL"));
        propertyValues.addPropertyValue(new PropertyValue("age",20));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);
        //注册
        beanFactory.registerBeanDefinition("person",beanDefinition);

        //获取bean

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person.toString());
    }



}
