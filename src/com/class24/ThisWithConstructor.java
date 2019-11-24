package com.class24;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	
	ThisWithConstructor(String str){
		System.out.println("I am a constructor with one String parameter");
	}
	
	public static void main(String[] args) {
		
		ThisWithConstructor obj = new ThisWithConstructor();
		
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello");
	}

}
