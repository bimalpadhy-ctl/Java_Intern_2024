package com.lumen.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<String> linkedhashset=new LinkedHashSet<>();//Order by insertion
		System.out.println(linkedhashset.size());
		linkedhashset.add("red");
		linkedhashset.add("green");
		linkedhashset.add("blue");
		linkedhashset.add("pink");
		linkedhashset.add("orange");
		linkedhashset.add(null);
		linkedhashset.add("orange");//dulicate not allowed 
		System.out.println(linkedhashset);
		
		System.out.println("Traversing Set via iterator");
		Iterator<String> itr=linkedhashset.iterator();
		while(itr.hasNext()) {
			String Color=itr.next();
			System.out.println(Color);
		}
		}
	}
