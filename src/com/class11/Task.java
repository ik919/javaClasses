package com.class11;

public class Task {
	public static void main(String[] args) {
		
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		//Create an array on integers and calculate the sum of all elements in an array.
		//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		
		
		String[] cars= {"Fusion", "Camry", "Civic","Elentra","Corolla","Soul"};
		
		
		for(int a=0; a<cars.length; a++) {
			System.out.println(cars[a]);
		}
		
		
		System.out.println("-------------------------------------------------");
		
		for(String forEach:cars) {
			System.out.println(forEach);
		}
	}

}
