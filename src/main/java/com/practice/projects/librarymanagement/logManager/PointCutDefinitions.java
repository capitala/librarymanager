package com.practice.projects.librarymanagement.logManager;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutDefinitions {
@Pointcut("execution(* com.practice.projects.librarymanagement.*.*.*(..))")
public void logger(JoinPoint joinPoint) {}

}
