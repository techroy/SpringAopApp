package com.aop.beans;

public class LoanCalculator {

	public int calculateLoan(int principal, int rateOfInt, int time) {

		return principal * rateOfInt * time;
	}

}
