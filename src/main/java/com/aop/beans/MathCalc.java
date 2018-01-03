package com.aop.beans;

public class MathCalc {
	
	
	public int add(int a,int b){
		System.out.println("Add methdo call");
		return a+b;
	}
	
	public int sub(int a,int b){
		return a-b;
	}
	
	public int mul(int a,int b){
		return a*b;
	}

}
