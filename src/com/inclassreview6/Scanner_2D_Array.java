package com.inclassreview6;

import java.util.Scanner;

public class Scanner_2D_Array {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Buddy, how many rows do you want?");
		int rows=scan.nextInt();
		System.out.println("Buddy, how many rows do you want?");
		int cols=scan.nextInt();
		
		System.out.println("Your array will have "+ rows+" rows and "+cols+" columns");
		
		
		String[][] names=new String[rows][cols];
		
		
		//names.length=rows
		//names[i].length= cols
		//Entering into array
		
		System.out.println("Buddy, enter all the names!");
		
		for(int i=0; i<rows; i++) {
			//System.out.println("Buddy, we're at row index "+row);
			for(int j=0; j<cols; j++) {
				if(j != 1) {
				
				names[i][j]=scan.next();
				} else {
				scan.next();
				}
			}
		}
		
		
		
		System.out.println("---------Let's print the 2D Array------------");
		
		
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(names[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
