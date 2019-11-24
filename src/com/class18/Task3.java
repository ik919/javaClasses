package com.class18;

public class Task3 {
	
	void palindrome(String original) {
		String reversed="";
		for(int i=original.length()-1; i>=0; i--) {
			reversed +=original.charAt(i);
		}
			System.out.println(reversed);
		
		if(original.equals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is NOT palindrome");
		}
	}
	
	
	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		
		obj.palindrome("Kayak");
		
	}

}
