package com.class13;

public class RegularExpressions2 {
	public static void main(String[] args) {
		
		String str="Today is our Java class";
		
		System.out.println(str.replace(" ", ""));
		System.out.println("---------------------------------");
		
		System.out.println(str.replaceAll("\\s" , ""));
	}
}
