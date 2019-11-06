package com.class7;

public class WhileLoop {

		public static void main(String[] args) {
			
			int time=8;

			if(time<12) { //if condition is true code executed 1 time
				System.out.println("Good Morning");
			}

			
			//infinite loop
			
			/*
			 * while (time<12) { //if condition is true
				System.out.println("Good Morning");
			}
			*/
			
			
			while (time<12) { //if condition is true
				System.out.println("Good Morning");
				time++;
			}
			
			//I want to print Good Afternoon 5 times
			
			int i=1;
			
			while (i<=5) {
				System.out.println("Good Afternoon");
				i++;
			}
			
			
			
		}
}
