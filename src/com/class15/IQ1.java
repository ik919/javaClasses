package com.class15;

public class IQ1 {
	public static void main(String[] args) {
		
	/*
	 * Write a program to swap 2numbers without a temporary variable
	 * Swap 2 strings without a temporary variable
	 */
		
		int a=10;
		int b=20;
		
		a=a+b; //30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
		
		System.out.println("----------------2nd Question----------------");
		
		String str1="Hello";
		String str2="Bye";
		
		str1=str1+str2;
		str2=str1.substring(0, 5);
		str1=str1.substring(5);
		
		System.out.println("The value of str1="+str1);
		System.out.println("The value of str2="+str2);
		
		System.out.println("----------------3rd Question----------------");
		
	}
}
