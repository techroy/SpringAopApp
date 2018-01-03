package com.aop.beans;

public class AuthenticationManager {

	static boolean logFlag = false;

	public void login(String userName, String pwd) {

		if (userName.equals("John") && pwd.equals("john123")) {

			logFlag = true;
		}

	}

	public boolean authenticatedUser() {

		return logFlag;
	}

}
