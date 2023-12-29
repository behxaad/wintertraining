package com.wintertraining.day2;

public class DataConversion {
	
	//String to Integer
	String age = "10";
	int votingAge = 18 - Integer.parseInt(age);
	Boolean b = Boolean.parseBoolean(age);
	
	//Integer to String
	int experience = 5;
	String experienceInYears = String.valueOf(experience);
	
	public static void main(String[] args) {
	
		DataConversion conversion = new DataConversion();
		System.out.println(conversion.getClass()); // Check class of object
		System.out.println(conversion.experienceInYears.getClass()); // check type of variable
		
		//System.out.println(conversion.votingAge);
		System.out.println(conversion.experienceInYears);
		System.out.println(conversion.b);
	}
	
}
