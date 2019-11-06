package com.class7;

public class WhileLoopPractice {
	public static void main(String[] args) {
		
		
		//how to print numbers from 1 to 20
		       int i=0;
		       while(i<=20) {
		           System.out.println(i);
		           i++;
		       }
		       //I want to print from 10 to 30
		       int y=10;
		       while(y<=30) {
		           System.out.print(y);
		           y++;
		       }
		       int d=10;
		       while(d<=30) {
		           System.out.print(d+" ");
		           d++;
		       }
		       //how to print values 10 to 1
		       int a=10;
		       while(a>=1) {
		           System.out.println(a);
		           a--;
		       }
		       //print values from 50 to 20
		       int b=50;
		       while(b>=20) {
		           System.out.println(b);
		           b--;
		       }
		           //print all the even numbers from 1 to 20
		       System.out.println("-------------------------");
		       int c=1;
		       while(c<=20) {
		           if(c%2==0) {
		               System.out.println(c);
		           }
		           c++;
		           }
		       int x=2;
		       while(x<=20) {
		           System.out.println(x);
		           x+=2;
		       }

		
		//I want to print all even numbers from 1 to 20 inclusive
		//1 way - increment value by 2
		int z=2;
		
		while (z<=20) {
			System.out.println(z);
			z+=2;
		}
		
		
		int q=2;
		
		while (q<=20) {
			System.out.println(".");
			if (q%2==0) {
				System.out.println(q);
			}
			q++;
		}
		
		System.out.println("----------------------------------");
		
		//print only odd number from 50 to 100.
		//print only even numbers from 100 to 1.
		
		int o=2;
		
		while (o>50 && o<100) {
			System.out.println(o);
			o+=2;
		}
	
	
	
	
	
	
	}

}
