package com.class11;

public class Task2 {
	public static void main(String[] args) {
		//Create an array on integers and calculate the sum of all elements in an array.
		
		int[] num= {1,2,3,4,5};
		int sum=0;
		//for(int fEach:num) {
			//System.out.println(fEach);
		
		for (int a=0; a<num.length; a++) {
			sum=sum+num[a];
		}
		System.out.println(sum);
	}
}
