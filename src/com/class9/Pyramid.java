package com.class9;

public class Pyramid {
	public static void main(String[] args) {
		
		//*
		//**
		//***
		//****
		//*****
		
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------------------");
		
		for (int i=1; i<=6; i++) {
			for (int b=1; b<i; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		
		for (int i=1; i<=9; i++) {
			for (int b=1; b<=i; b++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		
		for (int i=0; i<=9; i++) {
			for (int b=9; b>i; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		
		for (int i=9; i>=1; i--) {
			for (int b=1; b<=i; b++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
	}

}
