package com.class2;

public class Task2 {

	/*
	 * Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
	Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ “
Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
	 */
	public static void main(String [] args) {
		
		float num1= 2.2f;
		float num2= 1.1f;
		
		float sum=num1+num2;
		float sub=num1-num2;
		float mult=num1*num2;
		float div=num1/num2;
		
		System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The multipication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+div);
		
		
		
	//Task2
		
		double num3=3.9;
		
		double square=num3*num3;
		
		System.out.println("The square of "+num3+" is "+square);
		
		
	//Task3
		
		int width=5;
		int height=8;
		int perimeter=(width+height)*2;
		int area=width*height;
		
		String message= "The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area;
			
		
		System.out.println(message);
		
	}
}
