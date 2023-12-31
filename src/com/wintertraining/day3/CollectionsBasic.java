package com.wintertraining.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsBasic {
	
	public static void main(String[] args) {	
		
		//List accepting any value
		
		List list = new ArrayList<>();
		
		list.add("Behzad");
		list.add(20);
		list.add(true);
		list.add(20.03);
		list.add("Behzad");
		list.add(null);
		list.add(null);
		
		//Way 1 to iterate
		for(int i = 0 ; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		//Way 2 to iterate
		for(Object obj: list)
		{
			System.out.println(obj);
		}
		
		System.out.println("\n");
		
		// List accepting specific value
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("Rainawari");
		list2.add("Zakura");
		
		List<String> list3 = Arrays.asList("Habak","Ganderbal", "Lalchowk");
		
		list2.set(1, "Dargah");
		//list2.remove(1); // removes value at index 3
	
		Collections.replaceAll(list2, "Rainawari", "Rohtak");
		
		list2 = list3; //old age method to reasign the values from another object
		
		for(Object obj: list2)
		{
			System.out.println(obj);
		}
		
		
		System.out.println("\n");
		
		List<Integer> list4 = Arrays.asList(2,4,90,7,8); // Size is confined, cannot add new items like list4.add(10)
		List<Integer> list5 = new ArrayList<>();
		
		list5.add(200);
		list5.add(600);
		list5.add(700);
		list5.add(70);
		
		Collections.sort(list4); // Sorting the list values
		
		try
		{
		list4.add(4);
		}
		
		catch (Exception e) {
			e.printStackTrace();
			//This Exception is thrown because size is decided at initialization level
		}
		
		list5.addAll(list4); // add contentents of one list to another, but the list should be mutable
		
		System.out.println(list4);
		
		System.out.println(list5);
		
		
		List<Integer> list6 = new LinkedList<>();
		
		list6.add(3);
		list6.add(1);
		list6.add(0);
		list6.add(2);
		
		System.out.println(list6.subList(2, 4));
		
		System.out.println(list6);
		
	
	}

}
