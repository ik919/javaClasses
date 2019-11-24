package com.class21;

public class Employee {
	
	int eID, salary;
	static String CEO;
	
	void displayEmployeeInfo() {
		System.out.println("Employee with the ID: "+eID+" has a salary of "+salary+" and the CEO is: "+CEO);
	}

	public static void main(String[] args) {
		Employee.CEO="Sumair";
		
		Employee e1= new Employee();
		e1.eID= 1010;
		e1.salary= 120000;
		
		e1.displayEmployeeInfo();
		
		Employee e2= new Employee();
		e2.eID= 1011;
		e2.salary= 150000;
		
		e2.displayEmployeeInfo();
		
	}
}
