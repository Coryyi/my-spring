package org.springfamework.beans.factory.support;

import org.springfamework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例注册接口
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    /**
     * 单例注册表 存放已经创建的单例bean
     */
    private Map<String,Object> singletonObjects = new HashMap<>();

    /**
     * 返回单例bean
     * @param beanName
     * @return
     */
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String name,Object bean){
        singletonObjects.put(name,bean);
    }
}
