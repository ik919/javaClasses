package com.class11;

import java.util.Arrays;

public class ArrayManupilation {
	public static void main(String[] args) {
		
		String[] actualName= {"John", "Smith","Alex", "Tanaz"};
		
		Arrays.sort(actualName);
		
		
		String[] expectedName= {"Smith","John","Alex", "Tanaz"};
		
		Arrays.sort(expectedName);
		
		
		String actual=Arrays.toString(actualName);
        String expected=Arrays.toString(expectedName);
		
        
        System.out.println(actual);
        System.out.println(actual.equals(expected));
        
        
        // Without Sorting {"John", "Smith","Alex", "Tanaz"} =! {"Smith","John","Alex", "Tanaz"} == False
		// After Sorting [Alex, John, Smith, Tanaz] = [Alex, John, Smith, Tanaz]                 == True
	}

}
