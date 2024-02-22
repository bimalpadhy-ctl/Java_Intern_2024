package com.lumen.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {
	public static void main(String[] args) {
	Set<String> set=new HashSet<>();//unordered collection
	System.out.println(set.size());
	set.add("red");
	set.add("green");
	set.add("blue");
	set.add("pink");
	set.add("orange");
	set.add("orange");//dulicate not allowed 
	System.out.println(set);
	
	System.out.println("Traversing Set via iterator");
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()) {
		String Color=itr.next();
		System.out.println(Color);
	}
	}
}