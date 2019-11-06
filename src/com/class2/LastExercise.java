package com.class2;

public class LastExercise {
	public static void main(String[] args) {
		
		int a=10;
		int b=22;
		
		String x="Hello";
		String y="Bye";
		
		System.out.println(a+b+x+y);
		System.out.println(a+x+b+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
	
		// Java oparates from top to bottom and left to right, when it starts concatenating a value it will continue to concatanate
		//Hello+Bye= HelloBye --> HelloBye+10= HelloBye10 --> HelloBye10 + 20 = HelloBye1020
	}
}
