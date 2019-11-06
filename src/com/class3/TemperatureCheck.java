package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		double temperature= 32;
		double freezingPoint= 32;
		
		if (temperature<freezingPoint) {
			System.out.println("Water will freeze with temperature "+temperature);
		}else {
			System.out.println("Water will NOT freeze with temperature "+temperature);
		}
		

	}

}
