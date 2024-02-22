package com.lumen.Set;

	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.Set;
import java.util.TreeSet;

	public class TreeSetExample {

		public static void main(String[] args) {
			Set<String> treeset=new TreeSet<>();//Order by insertion
			System.out.println(treeset.size());
			treeset.add("red");
			treeset.add("green");
			treeset.add("blue");
			treeset.add("pink");
			treeset.add("orange");
			//treeset.add(null);
			treeset.add("orange");//dulicate not allowed 
			System.out.println(treeset);
			
			System.out.println("Traversing TreeSet via iterator");
			Iterator<String> itr=treeset.iterator();
			while(itr.hasNext()) {
				String Color=itr.next();
				System.out.println(Color);
			}
			}
		}

