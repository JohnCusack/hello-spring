package com.dark.hello.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class NotVeryUsefulAspect {
    @Pointcut("execution(* transfer(..))")  // the pointcut expression
    private void anyOldTransfer() {}  // the pointcut signature
}
