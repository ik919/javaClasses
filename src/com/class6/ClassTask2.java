package com.class6;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {
		Scanner scan;
		
		System.out.println("Please enter if you're making a sale: True/False? ");
		
		scan=new Scanner(System.in);
		
		boolean sale=scan.nextBoolean();
		
		double price=0;
		double discountPrice=0;
		double finalPrice=0;
		
		if(!sale) {
			System.out.println("I am not shopping");
		} else System.out.println("Please enter the price of the item: ");
			price=scan.nextDouble();
			if (price<=20) {
			discountPrice= price*0.1; 
		} else if (price>20 && price<100) {
			discountPrice= price*0.2;
			finalPrice= price-discountPrice;
		}else if (price>=100 && price<500) {
			discountPrice= price*0.3;
			finalPrice= price-discountPrice;
		}else if (price>=500) {
			discountPrice= price*0.5;
			finalPrice= price-discountPrice;
		}else {
			discountPrice= price;
			finalPrice= price-discountPrice;
		}
		
		System.out.println("After discount "+discountPrice+" the price of the item reduce from "+price+" to "+finalPrice);
	}

}
