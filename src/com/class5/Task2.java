package com.class5;

import java.util.Scanner;
public class Task2 {

		public static void main(String[] args) {
			
	Scanner input=new Scanner(System.in);
	
	System.out.println("Please enter your height in inches");
	
	double height=input.nextDouble();
	
		if(height<5) {
			System.out.println("You are short");
		}else if (height>5 && height<6) {
			System.out.println("You are medium");
		} else if (height>=6) {
			System.out.println("You are tall");
		}
	
		System.out.println("----------------------------------------------");
		
	int day=7;
	
	if (day>=1 && day<=5) {
		System.out.println("It is a weekday");
	}else if (day==6 || day==7) {
		System.out.println("It is a weekend");
	}else {
		System.out.println("Invalid day");
	}
		
		}
}
