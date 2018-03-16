package com.practice.projects.librarymanagement.performanceMonitor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceMonitor {
	private Logger logger=LoggerFactory.getLogger(this.getClass());

@Around("@annotation(TimeTracker)")
public Object around(ProceedingJoinPoint joinPoint) {
	long startTime=System.currentTimeMillis();
	Object obj=null;
	try {
		obj = joinPoint.proceed();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	logger.info("Total time taken by "+joinPoint +" is "+(System.currentTimeMillis()-startTime));
	return obj;
}

}
