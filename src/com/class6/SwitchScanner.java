package com.class6;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter their gender F or M
		 * based on the input provide
		 *  if F -->
		 */

		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your gender");
		
		char gender;
		String userGender;
		
		gender=scan.next().charAt(0);
		
		
		// Works only with byte, short, int, char, String
		// You cannot use relational OR logical operators OR primitive
		// Such as: >,<=, &&, ||, !
		//It only checks for equality
		
		switch(gender) {
		
		case 'F' : 
			userGender="Female";
			break;
		case 'M' : 
			userGender="Female";
			break;
		default:
			userGender="Unknown";
			
		}
		
		System.out.println("Your gender is "+ userGender);
		
		
	}

}
