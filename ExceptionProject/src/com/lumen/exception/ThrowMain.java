package com.lumen.exception;

import java.util.Scanner;

public class ThrowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to ABC Bank");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw :");
		int amt=sc.nextInt();
		System.out.println("Checking");
		Bank bank=new Bank();
		try {
			bank.withdraw(amt);
			System.out.println("Amount Withdrawn");
		}catch( Exception e) {
			System.out.println("insufficient balance");
		}
		System.out.println("Main completed");
	}

}
