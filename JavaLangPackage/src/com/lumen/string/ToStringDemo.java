package com.lumen.string;

public class ToStringDemo {

	String name,city;
	int salary;
	
	public ToStringDemo(String name, String city, int salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	public static void main(String args[]) {
		ToStringDemo ts=new ToStringDemo("Tom","Bangalore",1000);
		System.out.println(ts);
		ToStringDemo ts1=new ToStringDemo("Ram","Bangalore",1001);
		System.out.println(ts1);
	}

//@Override
//	public String toString() {
//		return "ToStringDemo [name=" + name + ", city=" + city + ", salary=" + salary + "]";
//	}
	
}
