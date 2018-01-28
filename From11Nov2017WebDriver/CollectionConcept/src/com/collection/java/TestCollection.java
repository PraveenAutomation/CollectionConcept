package com.collection.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestCollection {
	
	/* List:
	 * 1.ArrayList
	 * 2.Vector
	 * 3.LinkedList
	 * 
	 * Properties of List:
	 * 1. Insertion order are preserved.
	 * 2. Heterogeneous element insertion are possible.
	 * 3. Null are allowed.
	 * 4. Duplicate are allowed.
	 * 
	 * Uses of List:
	 * (Where we have to click the element based on index)
	 * For Example:
	 * List<WebElement> elements=driver.findElemnts(By.linkText("Home"));
	 * elements.get(1).click();
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add("Hi");
		list.add(12.52);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		System.out.println("===============================");
		
		for(Object var:list)
		{
			System.out.println(var);
		}
		
		System.out.println("===============================");
		for(int index=0;index<list.size();index++)
		{
			System.out.println(index);
		}
		System.out.println("=============Print reverse Order==================");
		
		for(int index=list.size()-1;index>=0;index--)
		{
			System.out.println(list.get(index));
		}
		
		System.out.println("===============================");
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		/*System.out.println("=============ListIterator==================");
		
		ListIterator<Object> litr=list.listIterator();
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
