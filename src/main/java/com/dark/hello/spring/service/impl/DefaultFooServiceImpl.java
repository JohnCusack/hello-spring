package com.dark.hello.spring.service.impl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dark.hello.spring.model.Foo;
import com.dark.hello.spring.service.FooService;

public class DefaultFooServiceImpl implements FooService {

    @Override
    public Foo getFoo(String name, int age) {
        return new Foo(name, age);
    }
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FooService foo = (FooService) context.getBean("fooService");
        foo.getFoo("Pengo", 12);
        System.out.println("OK");
    }
}
