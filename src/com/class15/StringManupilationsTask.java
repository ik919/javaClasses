package com.class15;

import java.util.Scanner;

public class StringManupilationsTask {
	public static void main(String[] args) {
		//lets ask user to enter browser
		//based on the input we say "Your selected browser is "_______
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter browser name");
		String browser=scan.nextLine();
		
		//equalignorecase
		
		switch(browser.toLowerCase()) {
		
		case "firefox":
			System.out.println("Your selected browser is "+browser);
			break;
		case "chrome":
			System.out.println("Your selected browser is "+browser);
			break;
		case "ie":
			System.out.println("Your selected browser is "+browser);
			break;
		case "safari":
			System.out.println("Your selected browser is "+browser);
			break;
		default:
			System.out.println("Please enter a valid browser");
		}
		
		
		
	}
}
