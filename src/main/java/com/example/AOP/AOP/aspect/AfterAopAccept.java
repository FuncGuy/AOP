package com.example.AOP.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AfterAopAccept {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value ="execution(* com.example.AOP.AOP.business.*.*(..))",
    returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("{} returned with value {} " + joinPoint, result);
    }
}

