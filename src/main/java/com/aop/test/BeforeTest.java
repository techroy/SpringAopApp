package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.AuthenticationManager;
import com.aop.beans.LoanCalculator;
import com.aop.beans.MathCalc;

public class BeforeTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/aop/config/application-context.xml");

		AuthenticationManager authenticationManager = new AuthenticationManager();
		
		authenticationManager.login("John", "john123");
		
		LoanCalculator loanCalculator = applicationContext.getBean("loanCalc", LoanCalculator.class);

		int returnval = loanCalculator.calculateLoan(10, 2, 3);

		System.out.println("Calculated loan ---" + returnval);

	}

}
