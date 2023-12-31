package com.wintertraining.day3;

public class CollectionsConcept1{

	public static void main(String[] args) {
		
		StudentClass studentClass = new StudentClass();
		studentClass.setName("Michael");
		studentClass.setAge(20);
		studentClass.setGrade("High School");
		studentClass.setActive(true);
		
		StudentClass studentClass2 = new StudentClass();
		studentClass2.setName("Hilford");
		studentClass2.setAge(30);
		studentClass2.setGrade("High School");
		studentClass2.setActive(false);
		
		System.out.println("=====STUDENT DETAILS=====\n");
		
		System.out.println("Name: "+studentClass.getName());
		System.out.println("Age: "+studentClass.getAge());
		System.out.println("Grade: "+studentClass.getGrade());
		System.out.println("Active: "+studentClass.isActive()+"\n");
		
		System.out.println("Name: "+studentClass2.getName());
		System.out.println("Age: "+studentClass2.getAge());
		System.out.println("Grade: "+studentClass2.getGrade());
		System.out.println("Active: "+studentClass2.isActive());

	}

}
