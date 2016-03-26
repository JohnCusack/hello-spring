package com.dark.hello.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.dao.DataAccessException;

public class DataAccessAspect {
    
    public void doAccessCheck() {
        
    }
    
    public void doAccessCheck(Object retVal) {
        
    } 
    
    public void doRecoveryActions(DataAccessException dataAccessEx) {
        
    }
    
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        Object retVal = pjp.proceed();
        return retVal;
    }
    
    public static void main(String[] args) {

    }
}
