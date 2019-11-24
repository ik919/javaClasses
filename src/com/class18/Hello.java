package com.class18;

public class Hello {
	
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		
		
		Hello obj= new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHello("Diego");
		
		
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("Turkey");
		obj.sayHelloDifferentLanguage("pAraGUAY");
		
		
		obj.sayNameAndAge("Jack", 45);
		obj.sayNameAndAge("Olga", 50);
		obj.isSnowing(false);
	}
	
	/* 
	 * Create a method that will say hello in different language
	 * based on the value that will be passed when user calls a method
	 */
	
	void sayHelloDifferentLanguage(String country) {
		
		switch (country.toLowerCase()) {
		
		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "paraguay":
			System.out.println("Hola");
			break;
		case "albania":
			System.out.println("Pershendetje");
		default:
			System.out.println("I don't know how to say hello in your language");
		
		}
		
		
		
		
	}
	
	//Method to say name and age
	
	void sayNameAndAge(String name, int age) {
		
		System.out.println("My name is "+name+" and I am"+age+" 25 years old.");
	}
	
	
	//Create a method that will check if it is snowing
	
	void isSnowing(boolean isSnowing) {
	
		if (isSnowing) {
			System.out.println("Stay Home");
		}else {
			System.out.println("Go for a walk");
		}
	}
	
	
	
}
