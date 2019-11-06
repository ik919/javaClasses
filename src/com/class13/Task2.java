package com.class13;

public class Task2 {
	public static void main(String[] args) {

		// Create a String and print it in reverse order (Sunday → yadnuS).
		
		
		String day="Sunday";
		
		//Method 1
		System.out.println(day.charAt(5)+""+day.charAt(4)+""+day.charAt(3)+""+day.charAt(2)+""+day.charAt(1)+""+day.charAt(0));
		
		
		
		System.out.println("------------Method 2-------------");
		System.out.println(day.length());
		
		for(int i=day.length()-1; i>=0; i--) {
			System.out.print(day.charAt(i));
		}
		
		System.out.println();
		
		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.
			
		
		System.out.println("------------Task 2-------------");
		
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
