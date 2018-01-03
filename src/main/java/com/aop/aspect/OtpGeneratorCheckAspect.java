package com.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class OtpGeneratorCheckAspect {

	public void checkOtp(JoinPoint jp, int otp) {

		if (otp < 0) {

			throw new IllegalArgumentException("Weak Otp ");
		}

	}
}
