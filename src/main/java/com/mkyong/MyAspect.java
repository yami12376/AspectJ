package com.mkyong;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

public class MyAspect {

	@Aspect
	public class CheckLogsAspect {
		
		@Around("execution(* *(..))")
		public void dontLogDuplicates(JoinPoint joinPoint) { 
			
			Object o = joinPoint.getArgs();
			System.out.println("test");

		}
	}
}
