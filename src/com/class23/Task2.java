package com.class23;

public class Task2 {
//	Write a java program of Class Students that takes students name and 3 subject grades. 
	//Inside your class also have a method to Calculate Average Grade. 
	//Test Student class for 5 different students with different marks. 
	//Your program should print an average mark of each students name.
//	NOTE: please use different names for instance and local variables.
	
	Task2(String studentName,int grade1, int grade2, int grade3) {
		int averageGrade= (grade1+grade2+grade3)/3;
		System.out.println(studentName+" has a grade of "+averageGrade);	
	}
	
	public static void main(String[] args) {
		Task2 student1= new Task2("Ali",55,67,89);
		Task2 student2= new Task2("Faruk",55,20,2);
		Task2 student3= new Task2("Ilham",75,99,69);
		Task2 student4= new Task2("Ahmet",95,97,29);
		Task2 student5= new Task2("Ihsan",100,100,100);
				
	}

}
