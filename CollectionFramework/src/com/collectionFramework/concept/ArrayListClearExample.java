package com.collectionFramework.concept;

import java.util.ArrayList;

public class ArrayListClearExample {

	public static <E> void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(4);
		al.add("Ram");
		al.add(6);
		
		System.out.println(al);
		
		System.out.println("before clear...="+al.size());
		
		al.clear();
		
		System.out.println("After clear...="+al.size());
		
		
		
		
		
		

	}

}
