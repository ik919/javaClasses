package com.class12;

public class StringManipulation {
	public static void main(String[] args) {
		
//There are two ways to create string objects.
        
        //1
        //String literal
        String name="John";
        System.out.println(name);
        System.out.println("The length of name is ="+name.length());
        
        
        
        
        //2
        //Creating String with new key word
        
        String name1=new String("John1");
        System.out.println(name1);
        /*This method returns the length of this string 
         * The length is equal to the number
         * of 16 bit Unicode characters in the string.
         */
        
        int name1Len=name1.length();
        System.out.println("The length of name is ="+name1Len);
        
        System.out.println("***************************************");
        
        String str1="HELLO World";
        System.out.println("Before:: "+str1);
        str1=str1.toLowerCase();
        System.out.println("After:: "+str1);
        
        //.equals()
        String str2="HEllo WoRLd";
        
        boolean isEqual=str1.equals(str2);
        System.out.println(isEqual);
        
        //.equlasIgnoreCase();
        
        System.out.println(str1.equalsIgnoreCase(str2)); //output is true since we ignore case.
        
        /* toUpperCase()
         * This method converts all of the characters in this String to UpperCase
         * 
         */
        String str3="Ahmet";
        System.out.println("Before:: "+str3);
        str3=str3.toUpperCase();
        System.out.println("After:: "+str3);
        
    }

}

