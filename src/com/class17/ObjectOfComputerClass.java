package com.class17;

public class ObjectOfComputerClass {

	public static void main(String[] args) {
		
		Computer comp1= new Computer();
		
		comp1.brand="Apple";
		comp1.name="MacBook Pro";
		comp1.keyboard=true;
		comp1.screen=15;
		comp1.memory=250;
		
		
		System.out.println("My computer is: "+comp1.brand+" "+comp1.name+" with screen "+comp1.screen+" and memory "+comp1.memory);
		

	}

}
