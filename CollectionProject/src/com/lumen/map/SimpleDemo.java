package com.lumen.map;

import java.util.*;
import java.io.*;

class SimpleDemo {
	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
