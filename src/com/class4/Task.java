package com.class4;

public class Task {
	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa= 3.5;
				
			if (diploma) {
				System.out.println("Congratulations");
				if (gpa>=3.5) {
					System.out.println("You're eligible for a scholarship");
				}else {
					System.out.println("You should've studied harder");
				}
			}else {
				System.out.println("You should get  degree");
			}
	
			System.out.println("---------------------------------");
			
		double mortgageRate=4.3;
		long mortgagePrice= 200000L;
		
		if (mortgageRate<=4.5) {
			System.out.println("Will buy house");
			if (mortgagePrice>200000) {
				System.out.println("Will take loan");
			}else {
				System.out.println("Will pay cash");
			}
		}else {
			System.out.println("Will not buy house");
		}
			
			
			
	}

}
