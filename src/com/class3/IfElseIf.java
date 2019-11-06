package com.class3;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 1000;

		if (num1 > num2) {
			System.out.println("Num1 is larger than num2");
		} else if (num1 == num2) {
			System.out.println("Num1 is equal to num2");
		} else {
			System.out.println("Num1 is smaller than num2");
		}

		// To format command+shift+f

		int day = 8;

		if (day == 1) {
			System.out.println("Today is Monday. I have to go to work");
		} else if (day == 2) {
			System.out.println("Today is Tuesday. I have SDLC Class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday. I have a Java Review Class");
		} else if (day == 4) {
			System.out.println("Today is Thursday. I have SDLC Revies Class");
		} else if (day == 5) {
			System.out.println("Today is Friday. Weekend is here");
		} else if (day == 6) {
			System.out.println("Today is Saturday. My favorite coding day");
		} else if (day == 7) {
			System.out.println("I love spending Sundays at Syntax");
		} else { // if I remove else if the conditions don't meet it will show nothing.
			System.out.println("I do not know this day");
		}
		// if (day==0) { doesn't work because else is the last condition

		System.out.println("I'm done with if statement");
	}
}
