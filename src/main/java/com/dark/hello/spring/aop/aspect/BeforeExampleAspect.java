package com.dark.hello.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeExampleAspect {
    @Before("execution(* com.dark.dao.*.*(..))")
    public void doAccessCheck() {
        // ...
    }
    
}
