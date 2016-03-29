package com.dark.hello.proxy.service.impl;

import com.dark.hello.proxy.service.Greeting;

public class GreetingImpl implements Greeting{

    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }

}
