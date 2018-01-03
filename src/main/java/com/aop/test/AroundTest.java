package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.MathCalc;

public class AroundTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/aop/config/application-context.xml");
		
		MathCalc mathCalc = (MathCalc)applicationContext.getBean("mathCalc");
		
		System.out.println("Proxy class --"+mathCalc.getClass().getName());
		
		int returnVal = mathCalc.sub(20, 4);
		
		
		//int returnVal = mathCalc.add(2, 4);
		
		System.out.println("Return Value--------->"+returnVal);
		
		


	}

}
