package com.dark.hello.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class SimpleProfilerAspect {
    public Object profile(ProceedingJoinPoint pjp, String name, String age) throws Throwable {
        StopWatch clock = new StopWatch("Profiling for '" + name + "' and '" + "'");
        clock.start(pjp.toShortString());
        try {
            return pjp.proceed();
        } finally {
            clock.stop();
            System.out.println(clock.prettyPrint());
        }
    }
}
