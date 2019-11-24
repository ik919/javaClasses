package com.class18;

public class Task {
	
	void larger(int num1, int num2) {
		if (num1<num2) {
			System.out.println(num2+" is greater than "+num1);
		}else if (num1==num2) {
			System.out.println(num2+" is equal to "+num1);
		}else {
			System.out.println(num1+" is greater than "+num2);
		}
	}
	
	public static void main(String[] args) {
		
		Task obj= new Task();
		
		obj.larger(544, 7);
		
		
		
	}
}
