package com.class4;

import java.util.Scanner;

public class TaskScanner {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter the amount of loan requested");
		
		int loan= keyboard.nextInt();
		
		if (loan<200000) {
			System.out.println("Your loan request is accepted");
		} else {
			System.out.println("Your loan request is denied");
	
		}
		
		System.out.println("------------------------------");
		
		System.out.println("Please enter your age");
		
		int age= keyboard.nextInt();
		
		if (age>=18) {
			System.out.println("Your driver license request is accepted");
		} else {
			System.out.println("You can try to get a learners permit");
	
		}
		
		System.out.println("------------------------------");
		
		System.out.println("Please input city name");
		
		String cityName=keyboard.next();
		
		System.out.println("Please input the temperature in Fahrenheit");
		
		double celsius, fahrenheit;
		
		fahrenheit = keyboard.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        
        System.out.println("Temperature in the "+cityName+" is "+celsius+" celsius"); 
        
		
	
	}

}
