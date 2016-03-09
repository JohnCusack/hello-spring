package com.dark.hello.spring.beans;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeExample {
    @Before("execution(* com.dark.dao.*.*(..))")
    public void doAccessCheck() {
        // ...
    }
    
}
