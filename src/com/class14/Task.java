package com.class14;

public class Task {
	public static void main(String[] args) {

	//	Create a String that will hold a sentence. 
	// Write a program to get a new String without any spaces.
	//
	// Create a String that should be combination of letters, numbers and special characters. 
	//Find out how many alpha characters are there in the String.
	//		​
	//		You have a String a=”Is it saturday? Is it raining? 
	//Do we have a Java Class today?” How would you find out how many sentences are in that String?	

		
		String snt="Create a String that will hold a sentence.";
		
		System.out.println(snt.replace(" ", ""));
		
		
		System.out.println("-----------------------------");
		
		String str="He102/>2ll03&#@o";
		String str2 = str.replaceAll("[^A-z]", "");
		System.out.println(str2.length());
		
		
		System.out.println("-----------------------------");
		
		String str3="Is it saturday? "
				+ "Is it raining? "
				+ "Do we have a Java Class today?";
		
		String[] arr=str3.split("\\?");
		
		System.out.println(arr.length);
		

		
		
	}

}
