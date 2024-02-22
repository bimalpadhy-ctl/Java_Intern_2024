package com.lumen.WrapperConversions;

public class ConversionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String to PDT");
		int a =Integer.parseInt("100");
		System.out.println(a);
		
		System.out.println("PDT to String");
		String s =Integer.toBinaryString(a);
		System.out.println(s);
		
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toString(a));
		System.out.println(Integer.toString(a,2));
		
		//Using autoboxing
		int x =10;
		Integer y = x ;
		System.out.println ("y = " + y ) ;	// Integer Object
		
		//object to string
		System.out.println ("Object to String" ) ;
		Long val=90l;
		System.out.println (val.toString() ) ;
		//for user define classes override tostring method
		longdemo ld=new longdemo();
		System.out.println (ld);
		

	}

}
