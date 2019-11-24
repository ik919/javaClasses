package com.class15;

public class StringManupilations {
	public static void main(String[] args) {
		//String class comes in java lang package
		
		//2 ways to create a String 
		
		//First - Using String Literal
		String str="Hello";
		
		//Second - Using New Keyword - creating a String object
		String str1=new String("hello");
		
		System.out.println(str);
		System.out.println(str1);
		
		//Find the number of characters inside the String
		int length=str.length();
		System.out.println(length);
		
		//Case conversion methods/functions
		str=str.toLowerCase().toUpperCase(); //HELLO
		System.out.println(str);//hello
		
		//verify if the String is Empty
		String myString=""; //empty value
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
		String myString1=null; //no value at all
		//System.out.println(myString1.isEmpty());
		
		
		//How to verify existence of characters in the string
		String a="Good evening students";
		boolean exist=a.contains("student");
		System.out.println(exist);
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
		
	}

}
