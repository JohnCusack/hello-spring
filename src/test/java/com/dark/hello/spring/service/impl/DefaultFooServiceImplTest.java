package com.dark.hello.spring.service.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dark.hello.spring.service.FooService;

public class DefaultFooServiceImplTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetFoo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FooService foo = (FooService) context.getBean("fooService");
        foo.getFoo("Pengo", 12);
    }

}
