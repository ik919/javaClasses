package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		// main + ctrl + space than + return

		/*
		 * Class schedule if tuesday --> SDLC IF Wednesday --> Java Review if thursday
		 * --> Java coding if Sunday --> my favorite Java coding
		 */

		int day = 1;

		if (day == 2) {
			System.out.println("SDLC Class");
		} else if (day == 3) {
			System.out.println("Review Class");
		} else if (day == 4) {
			System.out.println("SDLC Class");
		} else if (day == 6) {
			System.out.println("Java Class");
		} else if (day == 7) {
			System.out.println("Favorite Java CLass");
		} else {
			System.out.println("There is no class at school");
		}
	}
}
