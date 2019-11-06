package com.class13;

public class RegularExpressions {
	
	public static void main(String[] args) {
		
		/* 
		 * Print only text, remove numbers
		 */
		
		String str="1423Hel45645lo45898";
		String date="12-22-1990";
		
		
		System.out.println(str.replaceAll("[0-9]", ""));   //Print only Text
		System.out.println("----------------------------");
		
		
		System.out.println(str.replaceAll("[^0-9]", ""));  //Print only Numbers
		System.out.println("----------------------------");
		
		
		System.out.println(str.replaceAll("[a-zA-Z]", "")); ////Print only Numbers
		System.out.println("----------------------------");
		
		
		String str2="^$%^$%^How@#$@#$1234&^%$^"; //Print only Numbers and Text
		System.out.println(str.replaceAll("[^0-9a-zA-Z]", ""));
		System.out.println("----------------------------");
		
		

		
		
	}

}
