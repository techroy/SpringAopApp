package com.aop.beans;

public class ThrowerClass {

	public void raiseException(int value) {

		if (value < 0) {

			throw new IllegalArgumentException("Invalid Input");
		}
		
		System.out.println("Value ---"+value);
	}
}
