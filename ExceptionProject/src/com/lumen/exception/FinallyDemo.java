package com.lumen.exception;

public class FinallyDemo {
	public static void main(String args[]) {
		System.out.println("Welcome !!!");	
		try {
			String val=args[0];
			System.out.println("Value got:");
			int num=Integer.parseInt(val);
			System.out.println("Converted");
			int total=100/num;
			System.out.println("Total:"+total);
		}catch(Exception e) {
			System.out.println("Technical error");
		}finally {
			System.out.println("Close connections in finally");
		}
		System.out.print("Main() Completed");
	}
}
