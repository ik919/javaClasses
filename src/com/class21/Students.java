package com.class21;

public class Students {
	
	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	
	
	public static void main(String[] args) {
		
		Students s1=new Students();
		s1.studentName="Ali";
		s1.studentID=345;
		s1.numberOfStudents++;
		
		Students s2=new Students();
		s2.studentName="Seval";
		s2.studentID=456;
		s2.numberOfStudents++;
		
		Students s3=new Students();
		s3.studentName="Samuel";
		s3.studentID=567;
		s3.numberOfStudents++;
		
		System.out.println("The total number of student is: "+Students.numberOfStudents);
	}
}
