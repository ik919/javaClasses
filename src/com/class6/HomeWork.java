package com.class6;

import java.util.Scanner;

public class HomeWork {
	/* Write a program that will read three inputs of scores (quiz, mid term, and
	 * final scores) and determine the grade based on the following rules: if the
	 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
	 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
	 * 
	 * Write a program to determine the classMode. If there is no rain →
	 * classMode=“In Class”, otherwise classMode → “Online”.
	 */

	public static void main(String[] args) {
		
		Scanner scan;
		int quiz, midTerm, finalScore, average;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter quiz score");
		
		quiz=scan.nextInt();
		
		System.out.println("Please enter mid-term score");
		
		midTerm=scan.nextInt();
		
		System.out.println("Please enter final score");
		
		finalScore=scan.nextInt();
		
		average=(quiz+midTerm+finalScore)/3;
		
		if (average>=90) {
			System.out.println("A");
		} else if (average>=70 && average <90) {
			System.out.println("B");
		}else if (average>=50 && average <70) {
			//else if (average>=50 || average <70) is a logical error
			System.out.println("C");
		}else if (average<50) {
			System.out.println("F");
		}else {
			System.out.println("Unknown");
		}
		
		
		
		/* declare the time (1-24
		 * based on the time identify whether its morning, afternoon, evening or night
		 * if 1-11 ---> morning
		 * if 12-15 --> noon
		 * if 16-20 ---> evening
		 * if >20 --> night
		 */ 
		
		int time=26;
		String timeOfDay;
		
		if (time>1 && time<=11) {
			timeOfDay="Morning";
			//instead of System.out.println("Morning")
		} else if (time>=12 && time <16) {
			timeOfDay="Noon";
		}else if (time>=16 && time <20) {
			timeOfDay="Evening";
		}else if (time>=20 && time<=24) {
			timeOfDay="Night";
		}else {
			timeOfDay="Invalid";
		}
		
		System.out.println("Time of the day is: "+timeOfDay);
		
	}

}
