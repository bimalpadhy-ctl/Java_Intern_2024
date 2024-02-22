package com.lumen.string;

public class CloneDemo {

	public static void main(String args[])  {
		Student std1=new Student();
		std1.setStudentName("Ram");
		std1.setStudentId(10);
		System.out.println("Student 1 details:"+std1);
		Student std2=null;
		try {
			std2=(Student) std1.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		System.out.println("Student 2 details:"+std2);
		std1.setStudentName("Gopal");
		System.out.println("Student 1 details:"+std1);
		System.out.println("Student 2 details:"+std2);
		
		System.out.println(std1.getClass()==std2.getClass());
		System.out.println(std1.equals(std2));
		System.out.println(std1==std2);
		System.out.println(std1.getClass());
		
		
	}
}
