package com.inclassreview5;

import java.util.Scanner;

public class ArrayMaximum {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Hey buddy, tell us the size of the array");

		int size = scan.nextInt();

		int[] array = new int[size];
		
		System.out.println("The size of the array is: "+array.length );

		
		// Read values into Array
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number");
			array[i]=scan.nextInt();
		}

		
		System.out.println("-----------------------------");
		
		// Print values of the Array
		System.out.println("Values of the array");
		for(int i=0; i<size; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("-----------------------------");
		
		int max=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
			
		}
		System.out.println("The maximum number is: "+max);
		
	}

}
