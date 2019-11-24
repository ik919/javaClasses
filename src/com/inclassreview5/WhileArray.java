package com.inclassreview5;

import java.util.Scanner;

public class WhileArray {
	public static void main(String[] args) {
		
		//The size of the Array is fixed   !!!!!!!
		
		String[] array=new String[5];
		
		Scanner scan=new Scanner (System.in);
		
	
		int index=0;
		String name="";
		
		do {
			System.out.println("Enter names, if you want to stop type 'STOP' ");
			name=scan.nextLine();
			array[index]=name;
			index++;
		}while(index<array.length && !name.equalsIgnoreCase("STOP"));
		
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
	}
}
