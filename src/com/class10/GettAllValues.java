package com.class10;

public class GettAllValues {

	public static void main(String[] args) {

		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };

		int size = animals.length;

		// I want to print all values from an array
		// When value is Dog --> I love dogs
	
		for (int i = 0; i < size; i++) {
			
			if(animals[i].contentEquals("Dog")) {
				System.out.println("I love dogs");
			} else {
			System.out.println(animals[i]);
			}
		}
		
		
		
		
	}
}
