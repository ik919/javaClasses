package com.class7;

import java.util.Scanner;

public class HwTaskCalculator{
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter 3 distinct numbers");
	
	
	
	double no1 = scan.nextDouble();
	double no2 = scan.nextDouble();
	double no3= scan.nextDouble();
	
	if(no1!=no2||no2!=no3) {
	
    
        if (no1>no2) {
        
            if(no1>no3) {//no1>no2 && no1>no3
            System.out.println("Largerst number is first - "+ no1);
            }else {
            System.out.println("Largest number is third - "+no3);
            }
        }else {//assuming no2>no1
            if (no2>no3) {//no2>no1 && no2>no3 --> no2=largest
            System.out.println("Largest number is second - "+no2);
            }else {
            System.out.println("largerst number is third - "+no3);
        }
        	}
		
		}else
	
   
			System.out.println("Numbers are equal");
			
	}
}
