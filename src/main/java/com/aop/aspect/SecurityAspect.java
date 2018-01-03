package com.aop.aspect;

import org.aspectj.lang.JoinPoint;

import com.aop.beans.AuthenticationManager;

public class SecurityAspect {

	public void securityCheck(JoinPoint jp) throws IllegalAccessException {

		Object[] args = jp.getArgs();
		
		String methodName = jp.getSignature().getName();

		args[0] = Integer.parseInt(String.valueOf(args[0])) + 10;

		for (Object ob : args) {

			System.out.println(ob);

		}

		AuthenticationManager authenticationManager = new AuthenticationManager();

		if (!authenticationManager.authenticatedUser()) {

			throw new IllegalAccessException("Invalid userName and Password");

		}

	}

}
