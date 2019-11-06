package com.class4;

public class NestedIfMore {
	public static void main(String[] args) {
		/*
		 * check age, if age is less than 16 --> you're too young to drive
		 * 
		 */

		int age = 18;

		if (age >= 18) {
			System.out.println("You can get a driver license");
		} else if (age >= 16) {
			System.out.println("You can get driver permit");
		} else {
			System.out.println("You're too young to drive");
		}

		System.out.println("-----------------------------------");

		int age1 = 16;

		if (age1 < 16) {
			System.out.println("You're too young to drive");
		} else {
			System.out.println("You're eligible to drive");

			if (age1 >= 18) {
				System.out.println("You can drive alone");
			} else {
				System.out.println("You need your parents to drive");
			}
		}

		System.out.println("-----------------------------------------");

		/*
		 * we need to check if the student completed the quiz if yes --> good job, if
		 * not --> not good if they completed we will check score: if more than 90 -->
		 * you got an A if more than 80 --> you got a B anything else below --> you
		 * should study more
		 */

		boolean quiz = true;

		int score = 80;

		if (quiz) { // we can use quiz==true but it is the same thing
			System.out.println("Good Job !!!");
			if (score >= 90) {
				System.out.println("You got an A");
			} else if (score >= 80) {
				System.out.println("You got a B");
			} else {
				System.out.println("You should study more");
			}
		} else {
			System.out.println("Not Good !!!");
		}

	}
}
