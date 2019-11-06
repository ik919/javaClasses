package com.class13;

public class StringManipulation1 {
	public static void main(String[] args) {
		
		String str="Sunaday";
		
		boolean a= str.isEmpty();
		int b=str.length();
		int middle=str.length()/2;
		
		if(!a) {
			if(b%2!=0 && b>3) {
				System.out.println(str.charAt(middle));
			}
		}
	
	
	
	
	}
}
