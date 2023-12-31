package com.wintertraining.day3;

import java.util.*;

public class CollectionsConcept2 {

	public static void main(String[] args) {

		List<StudentClass> list = Arrays.asList(new StudentClass("Behzad", 11, "Primary", true),
				new StudentClass("Muneesa", 11, "Primary", true), new StudentClass("Michael", 11, "Primary", true));
		
		System.out.println("==Student Details==");
		
		for(int i = 0 ; i< list.size();i++)
		{
			System.out.println("\n");
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAge());
			System.out.println(list.get(i).getGrade());
			System.out.println(list.get(i).isActive());
		}

	}

}
