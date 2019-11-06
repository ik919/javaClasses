package com.class11;

public class Task3 {
	public static void main(String[] args) {
		//Create an array of countries. 
		//While retrieving all values from an array print capital for each country. (use 2 different loops).
		
		String[] country= {"Turkey", "USA" , "Ukraine", "Russia"};
		
			for(int a=0; a<country.length; a++) {
				if(country[a].contentEquals("USA")) {
					System.out.println("The capital of USA is: Washington DC");
				} else if (country[a].contentEquals("Turkey")) {
					System.out.println("The capital of Turkey is: Ankara");
				} else if (country[a].contentEquals("Ukraine")) {
					System.out.println("The capital of Ukraine is: Kiev");
				}else if (country[a].contentEquals("Russia")) {
					System.out.println("The capital of Russia is: Toronto");
				}
			} 
	
			System.out.println("-----------------------------------------------------------");
	
			for (String getCountry:country) {
				if(getCountry.contentEquals("USA")) {
					System.out.println("The capital of USA is: Washington DC");
				} else if (getCountry.contentEquals("Turkey")) {
					System.out.println("The capital of Turkey is: Ankara");
				} else if (getCountry.contentEquals("Ukraine")) {
					System.out.println("The capital of Ukraine is: Kiev");
				}else if (getCountry.contentEquals("Russia")) {
					System.out.println("The capital of Russia is: Toronto");
				}
				
			}
	}

}
