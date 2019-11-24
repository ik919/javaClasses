package com.class24;

public class Task {
	
	private Task() {
		System.out.println("I am private constructor");
	}
	
	Task(int i) {
		System.out.println("I am default constructor");
	}
	
	protected Task(String i) {
		System.out.println("I am protected constructor");
	}
	
	public Task(char i) {
		System.out.println("I am public constructor");
	}

	public static void main(String[] args) {
		
		Task priv=new Task();
		Task defa=new Task(2);
		Task protec=new Task("a");
		Task publ=new Task('$');
		
		
	}
}
