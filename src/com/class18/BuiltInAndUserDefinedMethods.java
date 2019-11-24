package com.class18;

import java.util.Scanner;

public class BuiltInAndUserDefinedMethods {
	
	public static void main(String[] args) {
	
		//Built in Methods- Limited and cannot be modifed.
		
		String str="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
		Scanner scan=new Scanner(System.in);
		String scannerString=scan.nextLine();
		System.out.println(scannerString);
		
		BuiltInAndUserDefinedMethods obj= new BuiltInAndUserDefinedMethods();
		obj.myMethod();
	} 
	
	
	// User defined: Unlimited and modifiable
	
	void myMethod()  //Method Header
	{		//Method Body
		System.out.println("This is user defined method that I created");
	}
	
	
}
