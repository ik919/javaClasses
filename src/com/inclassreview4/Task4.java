package com.inclassreview4;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
		//Prompt the user to ask the name 3 times and print "Hello____"
		
		Scanner scan=new Scanner(System.in);
		
	
		int i=1;
		
		while (i<=3) {
			System.out.println("Please enter your name");
			String name=scan.nextLine();
			i++;
		}
		
		System.out.println("Hello");
		
	}

}
