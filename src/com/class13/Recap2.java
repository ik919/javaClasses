package com.class13;

public class Recap2 {
	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		System.out.println("-------------------------");
		
		String str3=new String ("Bye");   //Different ID reference
		String str4=new String ("Bye");
		
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
	}

}
