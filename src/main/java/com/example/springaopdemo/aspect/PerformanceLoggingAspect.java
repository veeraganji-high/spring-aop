package com.example.springaopdemo.aspect;

import org.apache.juli.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Aspect
@Component
public class PerformanceLoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(PerformanceLoggingAspect.class);

    @Around("execution(* com.example.springaopdemo.controller.*.*(..))")
    public Object executionTime(ProceedingJoinPoint jointPoint)  throws Throwable {
        long startTime = System.currentTimeMillis();
        String methodName = jointPoint.getSignature().getName();
        Object[] args = jointPoint.getArgs();
        logger.info ("Entering method : {} with arguments : {}",methodName, args);
        Object result;
        try{
            result = jointPoint.proceed();
        } catch(Throwable throwable){
            logger.error("Exception in the method : {} | Message: {}",methodName,throwable.getMessage());
            throw throwable;
        }
        long executionTime = System.currentTimeMillis()-startTime;
        logger.info("Exiting method: {} | Executed in: {} ms | Result: {}",methodName,executionTime,result);
        return result;
    }
}
