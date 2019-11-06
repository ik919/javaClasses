package com.class8;

import java.util.Scanner;

public class Exercise
{

		public static void main(String[] args) {
			
		
		for(int i=0; i<50; i++) {
			if (i%3==0) {			
				continue;
			}
			System.out.println(i);
		}
			
		
		
		
		Scanner scan=new Scanner(System.in);
		
		//equalsIgnoreCase helps ignore casing
		
		
		for(int i=0; i<10; i++) {
			
		System.out.println("Apply for a credit card");
		String a=scan.nextLine();
			if (a.equalsIgnoreCase("yes")) {
				break;
			}
			
		}
		
		
			
		}
}
