package com.class25;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Creating an object of Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		
		emp.work();
		emp.getPaid();
		
		
		System.out.println("Creating an object of ScrumTeam class");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		
		sm.work();
		sm.getPaid();
		sm.artifacts="Product backlog, Sprint Backlog, Burndown Chart";
		sm.ceramonies="Sprint Demo, Sprint Planning, Sprint Retrospective, Daily Standup";
		sm.attendScrumMeetings();
		
		
		System.out.println("Creating an object of Developer class");
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceramonies="Sprint Demo, Sprint Planning, Sprint Retrospective, Daily Standup";
		
	}

}
