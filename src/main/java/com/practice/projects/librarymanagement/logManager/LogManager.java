package com.practice.projects.librarymanagement.logManager;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class LogManager {
    private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Before("com.practice.projects.librarymanagement.logManager.LogManager.logger()")
	public void before(JoinPoint joinPoint) {
		logger.info("Just Entered "+joinPoint);
	}

	@AfterThrowing(value = "com.practice.projects.librarymanagement.logManager.LogManager.logger()", throwing = "err")
	public void afterThrowing(JoinPoint joinPoint, Throwable err) {
		logger.error("Exception in"+joinPoint,err);
	}

	@AfterReturning(value = "com.practice.projects.librarymanagement.logManager.LogManager.logger()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
			logger.info("Returned successfully from"+joinPoint +" with "+result.toString());
	}
}
