package com.class10;

public class ArrayEx {
public static void main(String[] args) {
	
	char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };

	System.out.println(grades[1]);
	
	int a=2;
	System.out.println(grades[a]);
	
	
	a+=2;
	
	System.out.println(grades[a]);
	
	a--;
	
	System.out.println(grades[a]);
	
	
//	System.out.println(grades[0]);
//	System.out.println(grades[1]);
//	System.out.println(grades[2]);
//	System.out.println(grades[3]);
	
	System.out.println("-----------------------------------------");
	
	for(int i=0; i< grades.length; i++) {
		System.out.println(grades[i]);
	}
	
	
	System.out.println("-----------------------------------------");
	
	
	String[] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
	
	int size=animals.length;
	
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
		}
		
		
		//create an array to store 5 double values print in one line
		
		double[] number= {1.0,9.8,0.2,7.9,0.9};
	
		System.out.println("-----------------------------------------");
		System.out.println();
		
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+" ");
		}
	
	
	
}
}
