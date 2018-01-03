package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.ThrowerClass;

public class ThrowsTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/aop/config/application-context.xml");

		ThrowerClass throwerClass = applicationContext.getBean("throwerBean", ThrowerClass.class);

		throwerClass.raiseException(-23);

	}

}
