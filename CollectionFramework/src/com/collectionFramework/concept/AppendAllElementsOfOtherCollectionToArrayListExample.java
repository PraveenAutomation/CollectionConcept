package com.collectionFramework.concept;

import java.util.ArrayList;
import java.util.Vector;

public class AppendAllElementsOfOtherCollectionToArrayListExample {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Vector v=new Vector();
		v.add(4);
		v.add(5);
		
		list.addAll(v);
/*		v.addAll(list);
		System.out.println(list);
		System.out.println(v);*/
		System.out.println("After append ArrayList should contain.. ");
		
		

	}

}
