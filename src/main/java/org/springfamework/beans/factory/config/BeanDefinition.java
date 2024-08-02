package org.springfamework.beans.factory.config;

import org.springfamework.beans.PropertyValues;

/**
 * 用于定义bean信息的类
 * 包含bead的class类型、构造参数、属性值等
 * 每个bean对应一个BeanDefinition的实例化
 * 这里简化后BeanDefinition只包含bean的class类型
 */
public class BeanDefinition {
    /**
     * bean类型
     */
    private Class beanClass;
    /**
     * 属性以及值
     */
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }
    public BeanDefinition(Class beanClass,PropertyValues propertyValues){
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }

    public Class getBeanClass(){
        return beanClass;
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues(){
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues){
        this.propertyValues = propertyValues;
    }
}
