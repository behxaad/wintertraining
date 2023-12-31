package com.wintertraining.day3;

public class StudentClass {

	public String name;
	public int age;
	public String grade;
	boolean active;

	public StudentClass() {
		super();
	}

	public StudentClass(String name, int age, String grade, boolean active) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.active = active;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
