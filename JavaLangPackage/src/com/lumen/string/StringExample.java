package com.lumen.string;

public class StringExample {

	public static void main(String args[])  {
	String s="Hello , how are you ?";
	System.out.println("Char at 6 : " + s.charAt(6));
	System.out.println("ends with u : " + s.endsWith("u"));
	
	char c[]=new char[9];
	s.getChars(5, 13, c, 1);
	for (char v: c) {
		System.out.println(v);
	}
	
	System.out.println("Index of o :"+s.indexOf('o'));
	System.out.println("Index of o :"+s.indexOf('o',5));
	System.out.println("Index of o :"+s.lastIndexOf('o'));
	
	String sub=s.substring(5,12);
	System.out.println("Substrint :"+sub);
	
	String s1="Hello";
	String s2="Hello";
	System.out.println("String Literals :"+s1.equals(s2));
	System.out.println("String Reference :"+(s1==s2));
	
	String s3= new String("Hello");
	String s4= new String("Hello");
	System.out.println("String Obj :"+s3.equals(s4));
	System.out.println("String Reference :"+(s4==s3));
	System.out.println("String Reference :"+(s1==s3));
	
	
	
	
	}
}
