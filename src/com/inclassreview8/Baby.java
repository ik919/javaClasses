package com.inclassreview8;

public class Baby {
	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;
	
	void talk() {
		System.out.println("Bla Bla Bla");
	}
	
	void walk(int times) {
		for(int i=1; i<=times; i++) {
		System.out.println("Crawl");
		}
	}

	
	void cry() {
		System.out.println("Cry every minute");
	}
	
	void displayBabyInfo() {
		System.out.println("Full name is: "+firstName+" "+lastName);
		
		if(gender=='M') {
			System.out.println("Gender is: Boy");
		}else if (gender=='F') {
			System.out.println("Gender is: Girl");
		}else {
			System.out.println("Unknown");
		}
		
		
		
		System.out.println("Hair color is "+hairColor);
		
	}
	
}
