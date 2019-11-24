package com.inclassreview5;

public class ArrayIntro {
	public static void main(String[] args) {
		
		int[] a=new int[5];
		a[2]=7;
		a[4]=9;
		a[0]=4;
		a[1]=5;
		a[3]=2;
		
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			sum +=a[i];
		}
		
		System.out.println();
		System.out.println(sum);
		
		
		System.out.println("---------2nd Way----------");
		
		int[] b = {4,5,7,2,9};
		int sumB=0;
		
		for(int i=0; i<a.length; i++) {
			System.out.print(b[i]+" ");
			sumB= sumB+b[i];
		}
 		System.out.println();
		System.out.println(sumB);
		
		
		System.out.println("---------Array of Strings----------");
		
		
		
		String[] s= {"dog", "cat", "mouse", "bird", "donkey", "horse"};
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		
		
		
		
		
	}
}
