package com.class22;

public class LocalVariables {
	public static void main(String[] args) {
	
	//I want to access variable myName from different
		
		LocalVariables obj=new LocalVariables();
		obj.sayName();
		System.out.println("-------------");
		
		//System.out.println(myName); -->Won't be accessible it's a local variable scope is within sayName method
		
	}
	
	
	void sayName() {
		String myName="John";
		System.out.println(myName);
	}
	//System.out.println(obj); -->Won't be accessible scope is in main method
	
	
}
