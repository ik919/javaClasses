package com.class5;

public class LogicalNot {
	public static void main(String[] args) {
		
		boolean b1 = !true;
		boolean b2 =! false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		boolean traffic=false;
		//if traffic --> late , else on time
		
		if (!traffic) { // using ! we are reverting condition
			System.out.println("On Time");
		} else {
			System.out.println("Late");
		}
		
		boolean isRain=false;
		
		if(!isRain) {
			System.out.println("Take umbrella");
		} else {
			System.out.println("Don't take umbrella");
		}
		
		
		//let's compare 2 numbers using NOT operator
		
		int num1=10;
		int num2=10;
		
		if(num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
		
		
		if (!(num1==num2)) {
			System.out.println("Numbers are not equal");
		} else {
			System.out.println("Numbers are equal");
		}
		
		String name="Mary";
		String name2="Anna";
		
		if (!(name.equals(name) || name.equals(name2))) {
			System.out.println("You're not my sister");
		} else {
			System.out.println("You're my sister");
		}
		
	}

}
