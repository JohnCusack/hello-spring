package com.dark.hello.spring.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dark.hello.spring.service.FooService;

public class DefaultFooServiceImplTest {


   
    public void testGetFoo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FooService foo = (FooService) context.getBean("fooService");
        foo.getFoo("Pengo", 12);
    }
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FooService foo = (FooService) context.getBean("fooService");
        foo.getFoo("Pengo", 12);
    }

}
