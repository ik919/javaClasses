package com.inclassreview4;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
	//   Task One
        //Write a program using a do while loop to print out all odd number from 0 15 
		
		
	    //   Task Two
	  //  *keep asking user to pay for candy until entered price is equal to 3
	   //  *after user got a write amount print "Please enjoy your candy"*/  
		
		
		int i=0;
		
		do{
			if ((i%2==1))
			System.out.println(i);
			i++;
		} while (i<15); {
		}
	
		
		Scanner scan=new Scanner(System.in);
		int candy;
		
		do { 
			System.out.println("Please pay for the candy");
			candy=scan.nextInt();
		} while (candy!=3); {
			System.out.println("Please enjoy your candy");
		}
		
		
		
	}	
}
