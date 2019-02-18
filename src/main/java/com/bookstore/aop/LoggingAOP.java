package com.bookstore.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAOP {

	@Before("execution(* com.bookstore.controller..*.debug(*))")
	public void doLogging(JoinPoint joinPoint)
	{
		System.out.println("Before log.error()"+ joinPoint.getSignature().toShortString());
	}
}
