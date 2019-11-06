package com.inclassreview3;
import java.util.Scanner;
public class sd {
	
	    public static void main(String[]args) {
	      
	      Scanner scan=new Scanner(System.in);
	      
	    System.out.println("Please enter if it is sunny? TRUE/FALSE");
	      boolean isSunny=scan.nextBoolean();
	      
	      System.out.println("Please enter temperature");
	      int temperature=scan.nextInt();
	      
	      if(isSunny) {
	        System.out.println("It is a sunny day, I should go somewhere!");
	        if(temperature>85) {
	          System.out.println("I am going to the beach");
	        }else {
	          System.out.println("I am going to the park");
	        }
	      }else {
	        System.out.println("I stay home and practice Java");
	      }
	      
	    }

	}
