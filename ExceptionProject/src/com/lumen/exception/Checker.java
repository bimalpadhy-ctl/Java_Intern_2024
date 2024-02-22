package com.lumen.exception;

public class Checker {
	void checkCredentials (String name) throws Exception{
		if ( name.equals("admin")) {
			System.out.println("Welcome , correct credential");
			}else throw new Exception();
	}
}
