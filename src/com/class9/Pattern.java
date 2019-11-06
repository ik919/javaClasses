package com.class9;

public class Pattern {
		public static void main(String[] args) {
			
			for (int i=0; i<5; i++) {
				for (int j=0; j<7; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("--------------------------------");
			
			for (int i=1; i<5; i++) {
				for (int a=1; a<6; a++) {
					System.out.print(a);
				}
				
					System.out.println();
				}
			
			System.out.println("--------------------------------");
			
			for (int i=1; i<=5; i++) {
				for (int a=1; a<=5; a++) {
					System.out.print(i);
				}
				
					System.out.println();
				}
			
			System.out.println("--------------------------------");
			
			for (int i=1; i<=5; i++) {
				for (int a=1; a<=9; a++) {
					System.out.print(a);
				}
				System.out.println();
			}
				
			System.out.println("--------------------------------");
			
			for (int i=1; i<=5; i++) {
				for (int a=5; a>=1; a--) {
					System.out.print(a);
				}
				System.out.println();
			}
			System.out.println("--------------------------------");	
			
			for (int i=5; i>=1; i--) {
				for (int a=1; a<=5; a++) {
					System.out.print(i);
				}
				System.out.println();
			}
			
			
		}
}
