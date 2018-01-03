package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.OtpGenerator;

public class AfterReturningTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/aop/config/application-context.xml");

		OtpGenerator otpGenerator = applicationContext.getBean("otpGenerator", OtpGenerator.class);

		int value = otpGenerator.generateOtp();

		System.out.println("OTP --" + value);

	}

}
