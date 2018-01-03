package com.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public abstract class ApplicationPointcut {
	
	@Pointcut("execution(* com.aop.beans.MathCalc.*(..))")
	public void methodPointCut() {

	}

}
