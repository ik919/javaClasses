package com.inclassreview5;

public class NestedForLoopPyramid {
	public static void main(String[] args) {
//		/\
//		|1\2345
//		|12\345
//		|123\45
//		|1234\5
//		|12345\
//		--------

	for(int row=1; row<=5; row++) {
		//System.out.println(row);
		for(int col=1; col<=row; col++) {
			System.out.print(col);
		}
		System.out.println();
	}
	
	System.out.println("-----------------------");
	
	for(int row=1; row<=5; row++) {
		for(int col=1; col<=row; col++) {
			System.out.print(2*col-1);
		}
		System.out.println();
	}
	
	System.out.println("-----------------------");
	
	for(int row=1; row<=5; row++) {
		for(int col=1; col<=row; col++) {
			System.out.print(col*col+" ");
		}
		System.out.println();
	}
	
	
	
	}

}
