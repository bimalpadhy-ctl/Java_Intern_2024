package com.lumen.exception;

public class Bank {

	void withdraw(int x)throws Exception {
		try {
		System.out.println("Welcome ,You are in Bank");
		if (x>1000) throw new Exception("Not Allowed");
		else
		System.out.println("Withdrawn : "+x);
		}catch(Exception e) {
			System.out.println("Error occured");
			throw e;
		}finally {
			System.out.println("Close DB connection");
		}
		System.out.println("Work Done");
	}
}
