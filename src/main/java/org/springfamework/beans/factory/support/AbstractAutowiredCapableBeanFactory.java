package org.springfamework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import org.springfamework.beans.BeansException;
import org.springfamework.beans.PropertyValue;
import org.springfamework.beans.PropertyValues;
import org.springfamework.beans.factory.config.BeanDefinition;
import org.springfamework.beans.factory.support.strategy.InstantiationStrategy;
import org.springfamework.beans.factory.support.strategy.impl.SimpleInstantiationStrategy;

import java.lang.reflect.Constructor;

/**
 * 自动注入可用bean
 */
public abstract class AbstractAutowiredCapableBeanFactory extends AbstarctBeanFactory{
    /**
     * 实例化策略
     */
    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) throws BeansException {
        return doCreateBean(name,beanDefinition);
    }



    protected Object doCreateBean(String name,BeanDefinition beanDefinition) throws BeansException{


        //使用实例化策略进行实例化
        Object bean = createBeanInstance(beanDefinition);
        try {
            //添加bean属性值
            addPropertyValues(name,bean,beanDefinition);
            //将创建好的bean放入单例注册表中
            addSingleton(name,bean);
        }catch (Exception e){
            throw new BeansException("Instantiation of bean failed",e);
        }

        return bean;
    }
    protected Object createBeanInstance(BeanDefinition beanDefinition){
        //使用初始化策略进行初始化
        return getInstantiationStrategy().instantiate(beanDefinition);
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy){
        this.instantiationStrategy = instantiationStrategy;
    }
    public InstantiationStrategy getInstantiationStrategy(){
        return instantiationStrategy;
    }

    protected void addPropertyValues(String beanName,Object bean,BeanDefinition beanDefinition){
        try{
            for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValues()) {
                //通过反射设置属性
                BeanUtil.setFieldValue(bean,propertyValue.getName(),propertyValue.getValue());
            }
        }catch (Exception e){
            throw new BeansException("Error setting property value for bean"+beanName,e);
        }
    }


}
