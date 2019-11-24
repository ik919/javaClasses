package com.class15;

public class StringMoreExamples {
	public static void main(String[] args) {
		
		String str="Syntax Technologies Inc";
		
		char letter=str.charAt(5);
		System.out.println(letter);
		
		//System.out.println(str.charAt(str.length())); //StringIndexOutOfBounds
		System.out.println(str.charAt(str.length()-1));
		
		
		// Get a Substring from a String
		//Syntax
		
		String subStr=str.substring(0, 6);
		System.out.println(subStr);
		
		//Technologies Inc
		String subStr1=str.substring(7);
		System.out.println(subStr1);
	}

}
