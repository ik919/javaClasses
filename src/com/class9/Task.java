package com.class9;

public class Task {
	public static void main(String[] args) {
		
		/*
		 * Print the following pattern:
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 *  2- Print the following pattern:
		 *         *
		 *         **
		 *         **
		 *         *
		 */
		
		for (int a=5; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		
		for (int c=1; c<=5; c++) {
			for(int m=1; m<=c; m++) {
				System.out.print("*");
			if(m>=c) {
				
			}
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		for (int c=5; c>=1; c--) {
			for(int m=1; m<=c; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
