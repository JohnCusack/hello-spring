package com.dark.hello.spring.proxy.service.impl;

import com.dark.hello.spring.proxy.service.Greeting;

public class GreetingImpl implements Greeting{

    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }

}
