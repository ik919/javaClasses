package com.class5;

public class LogicalOr {
	public static void main(String[] args) {
		
		/* 7 days a week
		 *if day is 2 or 4 --> SDLC Class
		 *if day is 6 or 7 ---> Java Class
		 *if day 1 or 5 ---> No class
		 *if day is 3 ---> Review Class
		 */
		
		int day= 6;
			//false OR false --> false
		if (day==2 || day==4) {
			System.out.println("I have SDLC Class");
			//true OR false --> true
		} else if (day==6 || day==7) {
			System.out.println("I have Java Class");
			//false OR false --> false
		} else if (day==1 || day==5) {
			System.out.println("I have no Class");
		} else if (day==3) {
			System.out.println("I have a Review Class");
		}else {
			System.out.println("Not a valid day");
		}
		
		/* 7 days a week
		 *if day is Tuesday or Thursday --> SDLC Class
		 *if day is Saturday or Sunday ---> Java Class
		 *if day Monday or Friday ---> No class
		 *if day is Wednesday ---> Review Class
		 */
		
		String weekDay="Sunday";
		
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("I have SDLC Class");
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("I have Java Class");
		}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("I have no Class");
		}else if (weekDay.equals("Wednesday")) {
			System.out.println("I have a Review Class");
		}else {
			System.out.println("Not a valid day");
		}
	}
}



