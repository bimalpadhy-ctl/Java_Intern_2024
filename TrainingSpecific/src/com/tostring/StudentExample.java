package com.tostring;

public class StudentExample{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 StudentExample(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  
	 public static void main(String args[]){  
		 StudentExample s1=new StudentExample(101,"Raj","lucknow");  
		 StudentExample s2=new StudentExample(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	}  