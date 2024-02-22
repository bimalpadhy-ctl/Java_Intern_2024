package com.lumen.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistExample {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		System.out.println(list.size());//0
		list.add("Apple");
		list.addFirst("Mango");
		list.add(2,"Litchi");
		System.out.println(list);
		System.out.println(list.size());
		list.addLast("Banana");
		list.addFirst("Orange");
		System.out.println(list);
		
		System.out.println("Traversing via iterator");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String Fruits=it.next();
			System.out.println(Fruits);
		}
	}

}
