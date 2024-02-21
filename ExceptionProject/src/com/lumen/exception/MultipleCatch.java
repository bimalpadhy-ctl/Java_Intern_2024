package com.lumen.exception;

public class MultipleCatch {

	public static void main(String args[]) {
		System.out.println("Welcome !!!");	
		try {
			String val=args[0];
			System.out.println("Value got:");
			int num=Integer.parseInt(val);
			System.out.println("Converted");
			int total=100/num;
			System.out.println("Total:"+total);
		}catch(ArithmeticException e) {
			System.out.println("Dont Enter 0");
		}catch ( NumberFormatException e) {
			System.out.println("Input Numbers not characters");
		}catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("Pleae enter a value");
		}
		System.out.print("Main() Completed");
	}
}
