package com.collection.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	
	/*Properties of Set:
	 * 1. Insertion order is not preserved.
	 * 2.Heterogeneous element insertion are possible.
	 * 3.null  are allowed.
	 * 4.Duplicate are not allowed.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fiifth");
		set.add("Fiifth");
		set.add(null);
		set.add(null);
		
/*		System.out.println(set.size());
		System.out.println(set);*/
		
/*		for(String s:set)
		{
			System.out.println(s);
		}*/
		
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
