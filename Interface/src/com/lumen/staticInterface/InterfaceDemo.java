package com.lumen.staticInterface;

public class InterfaceDemo implements NewInterface {

	public static void main(String[] args) {
		InterfaceDemo interfaceDemo=new InterfaceDemo();
		// Calling the static method of interface
		NewInterface.hello();

		// Calling the abstract method of interface
		interfaceDemo.overrideMethod("Hello, Override Method here");
}

// Implementing interface method

@Override
public void overrideMethod(String str)
{
System.out.println(str);
}
}
