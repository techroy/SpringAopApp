package com.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class ThrowsAspect {

	public void logExcep(JoinPoint jp, Exception e) {

		System.out.println("Exception occurs at: " + jp.getSignature().getName() + " " + e);

	}

}
