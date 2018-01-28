package com.collection.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	/*Properties of Map:
	 * 
	 * Element are store din key:value pair
	 * name:praveen
	 * age:28
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("first", 1);
		map.put("second", 2);
		map.put("third", 3);
		map.put("fourth", 4);
		map.put("fifth", 5);
		map.put(null, null);
		map.put(null, 8);
		
		System.out.println(map.size());
		System.out.println(map);
		
		//System.out.println(map.get("third"));
/*		
		Set<String> keys=map.keySet();
		for(String s:keys)
		{
			if(s.equalsIgnoreCase("first"))
			{
				System.out.println(map.get(s));
			}
			
		}*/
		
		
	}

}
