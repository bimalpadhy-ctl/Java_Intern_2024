package com.lumen.exception;

public class BasicEx {
public static void main(String args[]) {
	
	try {
		System.out.print("Welcome");
		String val=args[0];
		System.out.print("Value got:");
		int num=Integer.parseInt(val);
		System.out.print("Converted");
		int total=100/num;
		System.out.print("Total:"+total);
	}catch(Exception e) {
		System.out.print(e);
	}
	System.out.print("Work Done:");
}
}
