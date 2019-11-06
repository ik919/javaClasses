package com.inclassreview3;

import java.util.Scanner;

public class SwitchStatementReview {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		 
		System.out.println("Enter name of the instructor");

		String instructor=s.nextLine();

		    switch(instructor) {
		      case "Shiva":
		        instructor="Will take care of Java Assignment";
		        break;
		      case "Sandish":
		        instructor="Will take care of SDLC Assignment";
		        break;
		      case "Weqas":
		        instructor="Will take care of Selenium Assignment";
		        break;
		      case "Asel":
		        instructor="Will take care of every Assignment";
		        break;
		      default:
		        instructor="Invalid instructor selected";
		    }
		 
		  System.out.println(instructor);
		
	}
}
