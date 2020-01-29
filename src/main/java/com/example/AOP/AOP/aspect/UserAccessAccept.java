package com.example.AOP.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class UserAccessAccept {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

   @Before("execution(* com.example.AOP.AOP.data.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("Check for user access ");
        logger.info("Allowed execution for" + joinPoint);
    }
}
