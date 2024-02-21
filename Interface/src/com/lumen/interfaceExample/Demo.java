package com.lumen.interfaceExample;

public class Demo {
public static void main(String args[]) {
	
	Flyable ref = new Man();
	ref.fly();
	ref = new Plane();
	ref.fly();
	ref = new Bird();
	ref.fly();
	
}
}
