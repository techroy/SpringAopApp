package com.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {

	public Object log(ProceedingJoinPoint pjp) throws Throwable {

		Object[] args = pjp.getArgs();
		
		String methodName = pjp.getSignature().getName();

		args[0] = Integer.parseInt(String.valueOf(args[0]))+10;
		
		System.out.println("------" +methodName+" Method call starts here--------");
		
		for (Object ob : args) {

			System.out.println(ob);
			

		}

		Object returnVal = pjp.proceed(args);
		
		//Object returnVal = 10;

		System.out.println("------" +methodName+" Method call ends here and return value is--" + returnVal);

		return (Integer)returnVal + 100;

	}

}
