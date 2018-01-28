package com.collection.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExampleNew {
	
	public static void main(String[] args) {
		
		Map<String,List<String>> map = new HashMap<String,List<String>>();		
		List<String> listOftestCases = new ArrayList<String>();
		
		listOftestCases.add("TC_01");
		listOftestCases.add("TC_02");
		
		map.put("TestCaseId", listOftestCases);
		System.out.println(map);
		
		Set<String> keys=map.keySet();
		for(String s:keys)
		{
			if(s.equalsIgnoreCase("third"))
			{
				System.out.println(map.get(s));
			}
			
		}
		
	}

}
