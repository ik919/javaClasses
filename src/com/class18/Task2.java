package com.class18;

public class Task2 {
	
	void oddOrEven(int a) {
		if(a%2==0 && a!=0) {
			System.out.println("This number is even");
		}else if(a==0) {
			System.out.println("This number is neutral");
		}else {
			System.out.println("This number is odd");
		}
	}
	
	public static void main(String[] args) {
		
		Task2 object1= new Task2();
		
		object1.oddOrEven(0);
		
		
	}

}
