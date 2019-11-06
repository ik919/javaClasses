package com.class12;

public class StringManipulation2 {
	
	public static void main(String[] args) {
		
		/*
		 *   .contains();
		 */
		
		
		String sentence="It was raining";
		String sent="raining";
		System.err.println(sent.contains(sentence));
		System.out.println(sent.contains("raining"));
		
		System.out.println("-------------------------");
		
		//Create two Strings and initialize them with some value.
		//Implement the following methods on those string.
		//sen.length();
		//sen.equals();
		//sen.contains();
		//sen.toUpperCase();
		//sen.toLowerCase();
		//sen.equalsIgnoreCase();
		
		
		String name="Ahmet";
		String sen="Ahmet is handsome";
		String lowName="ahmet";
		
		System.out.println(name.length());
		
		System.out.println(name.equals(lowName));
		
		System.out.println(sen.contains("is"));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.equalsIgnoreCase(lowName));
		
		
		
		
	}

}
