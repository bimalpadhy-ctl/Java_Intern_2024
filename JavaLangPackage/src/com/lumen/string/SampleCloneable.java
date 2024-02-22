package com.lumen.string;

// Java program to illustrate Cloneable interface 
	import java.lang.Cloneable; 
	  
	// By implementing Cloneable interface 
	// we make sure that instances of class Clone1 can be cloned. 
	class Clone1 implements Cloneable { 
	    int age; 
	    String name; 
	  
	    // A class constructor 
	    public Clone1(int age, String name) 
	    { 
	        this.age = age; 
	        this.name = name; 
	    } 
	  
	    // Overriding clone() method 
	    // by simply calling Object class 
	    // clone() method. 
	    @Override
	    protected Object clone() 
	        throws CloneNotSupportedException 
	    { 
	        return super.clone(); 
	    } 
	} 
	  
	public class SampleCloneable { 
	    public static void main(String[] args) 
	        throws CloneNotSupportedException 
	    { 
	    	Clone1 a = new Clone1(20, "Ram"); 
	  
	        // cloning 'a' and holding 
	        // new cloned object reference in b 
	  
	        // down-casting as clone() return type is Object 
	    	Clone1 b = (Clone1)a.clone(); 
	  
	        System.out.println(b.age); 
	        System.out.println(b.name); 
	    } 
	}
