package com.class7;

public class DoWhile {
		public static void main(String[] args) {
			
			int num=10;
			
			while (num<=7) {
				System.out.println("Hello");
				num++;
			}
			
			
			int num1=10;
			
			do {
				System.out.println("Bye");
				num1++;
			}while (num1<=7);
			
			System.out.println("-----------------------");
			
			
			
			//print even numbers from 20 to 50 using while & do while
			
			
			int a=22;
			
			while(a>20 && a<50) {
				System.out.println(a);
				a+=2;
			}
			
			
			System.out.println("-------------------------------");
			
			int b=20;
			
			do {
				System.out.println(b);
				b+=2;
			}while(b>20 && b<50);
			
			System.out.println("-------------Second Way------------------");
			//2nd way
			
			
			int even=20;
			
			do {
				if(even%2==0) {
					System.out.println(even);}
				even++;
			}while (even>20 && even<50);
			
			
			
		}
}
