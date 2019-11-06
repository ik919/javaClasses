package com.inclassreview3;

import java.util.Scanner; 

class Task3 {
    public static void main(String []args) {
      
    	//Write a program to find if the largest Number of three numbers
        //Print out  System.out.println("Largest number is " + largestNumber);
         // Must use if then a else if and lastly else 
    	
    	int n1,n2,n3;
    	
    	n1= 10;
    	n2= 20;
    	n3= 30;
    	
   
    			
    	if(n1>n2 && n1>n3) {
    		System.out.println("Largest number is "+n1);
    	} else if (n2>n3 && n2>n1) {
    		System.out.println("Largest number is "+n2);
    	} else {
    		System.out.println("Largest number is "+n3);
    	}
    	
    }

}