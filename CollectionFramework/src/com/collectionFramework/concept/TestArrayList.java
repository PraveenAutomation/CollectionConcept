package com.collectionFramework.concept;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.add(1, "Praveen");
		System.out.println(list);
		
		for(int index=0;index<list.size();index++)
		{
			System.err.println(list.get(index));
		}
		
	}

}
