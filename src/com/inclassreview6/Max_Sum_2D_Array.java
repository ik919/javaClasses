package com.inclassreview6;

public class Max_Sum_2D_Array {
	public static void main(String[] args) {
		
		
		int[][]b= {
				{2,3,5},
				{2,4,7},
				{8,1,9},
				{3,5,1}
		};
		
		//int max=0; is for POSITIVE NUMBERS
		
		//For ALL NUMBERS
		//int max = Integer.MIN_VALUE;
		
		int max= b[0][0];
		
		for(int i=0; i<b.length; i++) {
			for(int k=0; k<b[i].length; k++) {
				if(b[i][k]> max) {
					max =b[i][k];
					System.out.println("Maximum is changed to: "+max);
				}
			}
		}
		System.out.println("Final maximum number is: "+max);
		
		
		
		System.out.println("---------Find the Sum of the 2D Array----------------");
		
		int sum=0;
		
		for(int i=0; i<b.length; i++) {
			for(int k=0; k<b[i].length; k++) {
				sum += b[i][k];
				}
		}
		
			System.out.println("Sum of all the numbers is: "+sum);
		
		
		sum=0;
		int row =2;
		
		for (int k=0; k<b[row].length; k++) {
			sum+= b[row][k];
		}
		
		System.out.println("Sum in row "+row+" is: "+sum);
		
		
		
	}
}
