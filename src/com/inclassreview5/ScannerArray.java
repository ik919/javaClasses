package com.inclassreview5;

import java.util.Scanner;

public class ScannerArray {
	public static void main(String[] args) {
		
		//Read the array size from the scanner 
		//Create an array of Integer
		//Insert values of integers from Scanner
		//Print the sum of all elements
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please input the size of the array");
		
		int a=input.nextInt();
		
		int[] arr=new int[a];
		
		
//		for(int i=0; i<a; i++) {
//			arr[i]=input.nextInt();
//			System.out.println(arr[i]);
//		}
		
		
		for(int i=0; i<a; i++) {
			System.out.println("Please input the values of the array");
			arr[i]=input.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<a; i++) {
			sum+=arr[i];
		}
		System.out.println("The sum is: "+sum);
		
		
		
	
		
	}
}
