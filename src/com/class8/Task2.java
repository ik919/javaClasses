package com.class8;

public class Task2 {
		public static void main(String[] args) {
			
			
		
		int sumE=0;
		
		for (int i=2; i<=20; i+=2) {
			sumE=sumE+i;
			System.out.println(sumE+" + ");
		}
		System.out.println();
		System.out.println(sumE);
			
		int sumO=0;
		
		System.out.println("-----------------------");
		
		for (int i=1; i<=20; i+=2) {
			sumO=sumO+i;
			System.out.println(sumO+" + ");
		}
		System.out.println();
		System.out.println(sumO);
			
			
		
		System.out.println("------------2nd Way-----------");
		
		int sumEven= 0;
		int sumOdd= 0;
		
		for(int i=1; i<=20; i++) {
			if (i%2==0) {
				sumEven = sumEven+i;
			}else {
				sumOdd =sumOdd+ i;
			}
		}
				
			
		}
}
