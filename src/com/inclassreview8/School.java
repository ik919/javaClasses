package com.inclassreview8;

public class School {
	public static void main(String[] args) {
		
		Student student1= new Student();
		
		student1.studentNumber= 222;
		student1.studentName="Temel Laz";
		student1.gradeLevel="Grade 1";
		
		Student student2= new Student();
		
		student2.studentNumber= 312;
		student2.studentName="Mary Adams";
		student2.gradeLevel="Grade 3";
		
		Student student3= new Student();
		
		student3.studentNumber= 431;
		student3.studentName="James Best";
		student3.gradeLevel="Grade 3";
		
		
		Teacher teacher1= new Teacher();
		
		teacher1.teacherName="Paul Smith";
		teacher1.salary= 5000;
		teacher1.subject="Math";
		
		Teacher teacher2= new Teacher();
		
		teacher2.teacherName="Emily Jordan";
		teacher2.salary= 35000;
		teacher2.subject="Art";
		
		teacher1.teach();
		student1.study();
		student2.study();
		student3.sleep(); // THIS IS HDASDNAS
		teacher2.yell();
		
		
	}

}
