package com.class14;

public class SplitMethod2 {
	public static void main(String[] args) {
		
		String str="If you come to class early, "
				+ "then you can study more, also you can learn more, "
				+ "and you can leave early";
		
		String[] arr=str.split(",");
			
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].trim());
		}
		
		System.out.println("------------------------------------");
		
		String str1="Welcome to Syntax Technologies";
		String[] arr2=str1.split(" ", 3);
		System.out.println(arr2.length);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
			
	
	}
}
