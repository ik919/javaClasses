package com.class6;

import java.util.Scanner;

public class ClassTask{

	public static void main(String[] args) {
		
		Scanner scan;
		
		String month, Season;
		
		System.out.println("Please enter the month you were born in (Start with uppercase letter)");
		
		scan=new Scanner (System.in);
		
		month=scan.nextLine();
		
		if(month.equals("January") || month.equals("February") || month.equals("December")) {
				Season="Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
				Season="Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
				Season="Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
				Season="Fall";
		}else {
				Season="Invalid";
		}
		System.out.println("You were born in: "+Season);
	} 

}
