package com.lumen.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> myMap=new HashMap<Integer,String>();
		myMap.put(1, "Star");
		myMap.put(2, "Star");
		myMap.put(2, "Moon");//Replace Star  with Moon
		myMap.put(null, "Sun");
		myMap.put(null, "Pluto");//Accepts only one null key
		myMap.put(11, null);
		myMap.put(10, "Pluto");
		myMap.put(12, null);//allows multiple null values
		
		System.out.println(myMap.get(11));//Give the key and get the Value
		System.out.println(myMap.get(111));//Returns null
		System.out.println(myMap.containsKey(11));//if present it will return true
		
		System.out.println(myMap);
		
		Set<Integer> keys=myMap.keySet();//convert to set
		System.out.println(keys);//returns the Keys only as set
		
		System.out.println("Traversing Map via iterator---------->");
		Iterator<Integer> itr=keys.iterator();//iterate keys to get the vakue
		while(itr.hasNext()) {
			Integer myKey=itr.next();
			System.out.println(myKey + " " + myMap.get(myKey));
		}
		
		
		
		
		
		
		
	}

}
