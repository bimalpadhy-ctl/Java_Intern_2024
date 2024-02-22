package com.lumen.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		System.out.println(list.size());//0
		list.add("Ram");
		list.add("Gopal");
		//list.add(10);
		System.out.println(list);
		list.add(1,"Tom");
		System.out.println(list);
		System.out.println(list.size());//3
		list.set(1, "Hari");
		list.add("Bob");
		System.out.println(list);
		System.out.println(list.get(1));
		
		ArrayList<String> list1=new ArrayList<>();
		list1.addAll(list);
		System.out.println(list1);
		
		System.out.println("Traversing via iterator");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(name);
		}
		System.out.println("Reversing the elements in list via listiterator");
		ListIterator<String> li=list.listIterator(list.size());
		while(li.hasPrevious()) {
			String name=li.previous();
			System.out.println(name);
		}
		System.out.println("List values are :"+list);
		
	}

}
