package com.class2;

public class ArithmeticOperations {
/*
 * declare 2 variables and initialize them
 * display result of addition, subtraction, multiplication and division
 */
	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=20;
		num2=10;
		
	System.out.println(num1+num2); //30
	System.out.println(num1-num2); //10
	System.out.println(num1*num2); //200
	System.out.println(num1/num2); //2
	
	//how can we print the value of num1 and num2 together without doing an arithmetic operation
	
	System.out.println(num1+" "+num2);
	
	
	int sum=num1+num2;
	int sub=num1-num2;
	int mult=num1*num2;
	int div=num1/num2;
	

	System.out.println(sum);
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(div);
	
	//the addition of 2 number is ___
	
	System.out.println("The addition of 2 number is "+sum);
	System.out.println("The subtraction of 2 number is "+sub);
	System.out.println("The multipication of 2 number is "+mult);
	System.out.println("The division of 2 number is "+div);
	

	}
}
