package com.inclassreview5;

public class NestedForLoopHotelRoom {
	public static void main(String[] args) {
		
//		*
//		*
//		*
//		*
//		*
//		*
//		*
//		*
//		*
//		*
		
		for (int i=1; i<=10; i++) {
			System.out.println("*");
		}
		
		System.out.println("----------------------------------------");
		
		//******
		//******
		//******
		//******
		
		for(int i=1; i<=4; i++) {
			//System.out.println("Before inner loop");
			for(int l=1; l<=6; l++) {
				System.out.print("*");
			}
			System.out.println();
			//System.out.println("After inner loop");
		}
	
		System.out.println("----------------------------------------");
		
		// 1st floor rooms 1.1 - 1.2 - 1.3 - 1.4 - 1.5 - 1.6
		// 2nd floor rooms 2.1 - 2.2 - 2.3 - 2.4 - 2.5 - 2.6
		
		for(int floor=1; floor<=4; floor++) {
			System.out.print("Floor "+floor+" -> ");
			for(int room=1; room<=6; room++) {
				System.out.print(floor+"."+room+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		for(int floor=1; floor<=4; floor++) {
			System.out.print("Floor "+floor+" -> ");
			for(int room=1; room<=6; room++) {
				System.out.print(room+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		for(int floor=1; floor<=4; floor++) {
			System.out.print("Floor "+floor+" -> ");
			for(int room=1; room<=6; room++) {
				System.out.print(floor+" ");
			}
			System.out.println();
		}
		
System.out.println("----------------------------------------");
		
		for(int row=1; row<=4; row++) {
			System.out.print("Row "+row+" -> ");
			for(int column=1; column<=6; column++) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
		
		
	}

}
