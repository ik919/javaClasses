package com.class8;

import java.util.Scanner;

public class DoWhileExample {
	
	public static void main(String[] args) {
	/*
	 * Let's ask user to enter if it is raining or not (true/false)
	 * as long as there's rain let's keep asking
	 * if not ---> you can go to the park
	 */
		Scanner scan=new Scanner(System.in);
		
		boolean isRain;
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.hasNextBoolean();
		}while(isRain);
		
		System.out.println("Go to the park");
		
		
		
		
		
		
	}
}
