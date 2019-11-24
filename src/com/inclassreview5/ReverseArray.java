package com.inclassreview5;

public class ReverseArray {
	public static void main(String[] args) {
		
		String[] animals= {"dog", "cat", "mouse", "bird", "donkey", "horse"};
		
		//i=animals.length will give ArrayIndexOutOfBounds Exception !!!!!!
		
		//The last index of the array is one less than the array.length !!!!!
		
		for(int i=animals.length-1; i>=0; i--) {
			System.out.println(animals[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
