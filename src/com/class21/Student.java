package com.class21;

public class Student {
	
	public String studentName;
	public double GPA;
	public String school;
	
	public void displayInfo() {
		System.out.println(studentName+" is attending "+school+" has a GPA of "+GPA);
	}

	public void study(int hours) {
		int localVariable=4;
		System.out.println(studentName+" is studying for "+hours+" hours.");
	}
	
	
	
}
