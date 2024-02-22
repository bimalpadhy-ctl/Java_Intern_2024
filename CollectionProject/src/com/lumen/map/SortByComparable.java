package com.lumen.map;

import java.util.*; 

public class SortByComparable {

	public static void main(String args[]){  
		ArrayList<Student1> al=new ArrayList<Student1>();  
		al.add(new Student1(101,"Vijay",23));  
		al.add(new Student1(106,"Ajay",27));  
		al.add(new Student1(105,"Jai",21));  
		  
		Collections.sort(al);  
		for(Student1 st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		}
}
