package com.lumen.exception;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Checker ck=new Checker();
		try {
			ck.checkCredentials(name);
			System.out.println("Correct continue to site");
			}catch(Exception e){
				System.out.println("Invalid User");	
			}
		
	}
	

}
