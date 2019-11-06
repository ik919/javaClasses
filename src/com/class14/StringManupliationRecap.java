package com.class14;

public class StringManupliationRecap {
	public static void main(String[] args) {
	
		
		//To compare reference variable use ==
		//To compare content.
		
		//One object two different reference
		String str=new String("Hello");
		String str3=new String("Hello");
		
		
		System.out.println(str==str3);
		System.out.println(str.equals(str3));
		
		System.out.println("------------------------------");
		
		
		//One object one reference
		
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		System.out.println("------------------------------");
		
		System.out.println(str);
		String str2=str.replaceAll("Hello", "Bye");
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		}
}
