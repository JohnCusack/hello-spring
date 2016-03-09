package com.dark.hello.spring.service.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;

public class ConcurrentOperationExecutor implements Ordered {
    private static final int DEFAULT_MAX_RETRIES = 2;
    private int maxRetries = DEFAULT_MAX_RETRIES;
    private int order = 1;

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    @Override
    public int getOrder() {
        return this.order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        int numAttempts = 0;
        PessimisticLockingFailureException lockingFailureException;
        do {
            numAttempts++;
            try {
                return pjp.proceed();
            }catch (PessimisticLockingFailureException e) {
                lockingFailureException = e;
            }
        } while(numAttempts <= this.maxRetries);
        throw lockingFailureException;
    }
}
