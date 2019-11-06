package com.class10;

public class Task {
	public static void main(String[] args) {

//		Create an array of chars and store grades into it: A,B,C,D,E,F. 
		// Then print a grade B (use 2 different ways of creating an array).
//Create an array of names and store all names of your group. 
//Then print your name from that array. (use 2 different ways of creating an array).
//
//
//Create an array of words: Java, Saturday, day, coding, is. 
//Print the following sentence using element of array: “Saturday is Java coding Day”. 	

		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';

		System.out.println(grades[1]);

		char[] grades1 = { 'A', 'B', 'C', 'D', 'E', 'F' };

		System.out.println(grades1[1]);

		String[] names = new String[3];
		names[0] = "Ihsan";
		names[1] = "Ahmet";
		names[2] = "Farrukh";

		System.out.println(names[2]);

		String[] name = { "Ihsan", "Ahmet", "Farrukh" };

		System.out.println(name[2]);

		String[] words = { "JAVA", "Saturday", "day", "coding", "is" };

		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);

		
		
	}
}
