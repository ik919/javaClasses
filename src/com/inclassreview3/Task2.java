package com.inclassreview3;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	
	//Write a program that prints out if it is good weather to go for a bike ride. The weather is good if the temperature is between 60 degrees and 100 degrees inclusive unless it is raining. If temperature is less than 60 program should say
	//it is too cold, if the temperature is more than 100, program should say it is too hot.
	
	Scanner input=new Scanner(System.in);
	
	
	int temperature;
	
	System.out.println("Please enter the temperature in Fahrenheit for today:");
	
	temperature=input.nextInt();
	
	boolean rain=true;
	
	
	if(temperature>60 && temperature<=100 && !rain) {
		System.out.println("Weather is good for a bike ride");
	} else if (temperature<=60) {
		System.out.println("It is too cold for a bike ride");
	} else if (temperature>100) {
		System.out.println("It is too hot for a bike ride");
	} else if (rain) {
		System.out.println("Weather is not good for a bike ride because it is raining");
	}

}
}
