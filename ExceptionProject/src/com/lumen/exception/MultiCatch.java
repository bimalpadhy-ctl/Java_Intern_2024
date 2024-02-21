package com.lumen.exception;

public class MultiCatch {

	public static void main(String args[]) {
		System.out.println("Welcome !!!");	
		try {
			String val=args[0];
			System.out.println("Value got:");
			int num=Integer.parseInt(val);
			System.out.println("Converted");
			int total=100/num;
			System.out.println("Total:"+total);
			int m[]=null;
			System.out.println(m[7]);
		}catch( NumberFormatException | NullPointerException | ArithmeticException 
				| ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.print("Main() Completed");
	}
}
