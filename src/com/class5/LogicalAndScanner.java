package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

		public static void main(String[] args) {
			
		/* ask user to enter age 
		 * if age is from 1-3 --> you're a baby
		 * if age is from 3-5 --> you're a toddler
		 * if age is from, 5-12 --> you're a kid
		 * if age is from, 12-20 --> you're a teenager
		 * if age is >20 --> you're an adult
		 */
		
		System.out.println("Please enter your age");
		
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		
		if (age>=1 && age<3) {
			System.out.println("You're a baby");
		} else if (age>=3 && age<5) {
			System.out.println("You're a toddler");
		} else if (age>=5 && age<12) {
			System.out.println("You're a kid");
		}else if (age>=12 && age<20) {
			System.out.println("You're a teenager");
		}else if (age>=20) {
			System.out.println("You're an adult");
		}else {
			System.out.println("Invail age entered");
		}
		
		
			
		}
}
