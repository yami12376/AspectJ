package com.mkyong;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
//  @Around("call(* org.apache.log4j.*(..))") // execution
  @Around("call(* org.apache.log4j.Category*..*(..))") // execution
  public Object dontLogDuplicates(ProceedingJoinPoint thisJoinPoint) throws Throwable {
    System.out.println(thisJoinPoint);
    return thisJoinPoint.proceed();
  }
}


