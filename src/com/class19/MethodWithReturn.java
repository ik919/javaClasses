package com.class19;

import com.class24.Task;

public class MethodWithReturn {
	
	public static void main(String[] args) {
		
		/*
		 * Declare a String and if String has more than 10 characters 
		 * ----> String is large 
		 * otherwise ---> String is small
		 */
		
		
		String str="Welcome home";
		int numOfChars= str.length();
		if(numOfChars>=10) {
			System.out.println("String is large");
		}else {
			
			System.out.println("String is small");
		}
		
		
		char characther=str.charAt(4);
		
		System.out.println(characther);

	}

}
