package com.class10;

public class Task2 {
	public static void main(String[] args) {
		
		//Create an array of countries. 
		//While retrieving all values from an array print capital for each country.
		
		String[] country= {"Turkey","Greece", "USA", "Germany"};
		
//		for(int a=0; a<country.length; a++) {
//			if(country[a].equals("Turkey")) {
//				System.out.println("The capital is Ankara");
//			} else if(country[a].equals("Greece")) {
//				System.out.println("The capital is Athens");
//			} else if (country[a].equals("USA")) {
//				System.out.println("The capital is Washington DC");
//			}else if (country[a].equals("Germany")) {
//				System.out.println("The capital is Berlin");
//			}
//			
//			}
		
//		for(int a=0; a<country.length; a++) {
//			switch(country[a]) {
//			
//			case "Turkey":
//				System.out.println("Ankara");
//				break;
//			case "Greece":
//				System.out.println("Athens");
//				break;
//			case "USA":
//				System.out.println("Washington DC");
//				break;
//			case "Germany":
//				System.out.println("Berlin");
//				break;
//				
//			}	
				
		String capital=null;
		
		for(int a=0; a<country.length; a++) {
			switch(country[a]) {
			
			case "Turkey":
				capital="Ankara";
				break;
			case "Greece":
				capital="Athens";
				break;
			case "USA":
				capital="Washington DC";
				break;
			case "Germany":
				capital="Berlin";
				break;
				
			}
			System.out.println(capital);
		}
				

		
		
		

			
			
		
	}
}
