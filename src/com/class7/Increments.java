package com.class7;

public class Increments {
	public static void main(String[] args) {
		
	
	int a=10;
    a=a+1; //assignment
    a+=1; //shorthand assignment
    System.out.println(a); //12
    
    a++;//increment operator
    System.out.println(a);
    
    System.out.println("***********");
    int b=10;
    b-=1;//9
    b--;//decrement operator //8
    System.out.println(b);

    // increment&decrement operators can be used 
    // only with variables;
    
    int c=23;
    c++;
    //1++; compile error invalid argument
    
	}
}
