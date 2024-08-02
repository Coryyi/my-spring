package org.springfamework.beans.factory.service.impl;

import org.springfamework.beans.factory.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
