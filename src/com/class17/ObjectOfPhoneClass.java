package com.class17;

public class ObjectOfPhoneClass {
	public static void main(String[] args) {
		
		Phone p1= new Phone();
		Phone p2= new Phone();
		Phone p3= new Phone();
		
		p1.brand="Apple";
		p1.make="Iphone";
		p1.color="Red";
		p1.model=10; 
		p1.memory=512;
		
		System.out.println("I own a "+p1.color+" "+p1.brand+" "+p1.make+" "+p1.model+" with memory of "+p1.memory+" gb.");
		
		p1.takePhoto();
		p1.waterResistant();
		p1.videoCall();
		
		p2.brand="Android";
		p2.make="Galaxy";
		p2.color="White";
		p2.model=11; 
		p2.memory=256;
		
		System.out.println("I own a "+p2.color+" "+p2.brand+" "+p2.make+" "+p2.model+" with memory of "+p2.memory+" gb.");
		
		p2.takePhoto();
		p2.waterResistant();
		p2.videoCall();
		
		
		
	}

}
