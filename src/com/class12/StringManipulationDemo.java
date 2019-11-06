package com.class12;

public class StringManipulationDemo {
	public static void main(String[] args) {
		//1-) String Literal
		String name="John";
		System.out.println(name);
		System.out.println(name.length());
		
		//2-) Creating String with new key word
		String name1=new String("John1");
		System.out.println(name1);
		System.out.println(name1.length());
		
		/*
		 * This method returns the length of this string.
		 * The length is equal to the number
		 * of 16-bit Unicode characters in the string.
		 */
		
		int name1Length=name1.length();
		
		System.out.println("The length of name1 is= "+name1Length);
	
		
		String str1="HELLO WORLD";
		System.out.println(str1);
		String newValOfstr1= str1.toLowerCase();
		System.out.println(newValOfstr1);
	
	}

}
