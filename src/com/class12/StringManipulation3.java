package com.class12;

public class StringManipulation3 {
	public static void main(String[] args) {
		
		/*
		 * This method checks weather a String is empty or not.
		 * This method returns true if the given string is empty.
		 * Else, it returns false
		 */
		
		
		String str="";
		System.out.println("Is this string empty= "+str.isEmpty());
		
		String str2="Hello";
		System.out.println("Is this string empty= "+str2.isEmpty());
		
		
		
		if(!str.isEmpty()) {
			System.out.println("This String is not empty");
		}else {
			System.out.println("This is empty String");
		}
		
		
		
		
		//   \n skips to the next line
		String sentence="Each day hasa promise to brighten up the day,\nBut first you must alloq the sun to come your way.";
		System.out.println(sentence);
		
		
		
		/*This method appends one String to the end of another.
         * The method returns a String with the value of the String passed in to the method appended to the end
         * of the String used to invoke this method.
         * 
         */
        System.out.println("**************************************");
        
        String str3="Hello";
        String str4="World";
        
        System.out.println(str4+str3);
        System.out.println(str3.concat(str4));
        
        System.out.println("**************************************");
        
        String str6=" How are you? ";
        System.out.println(str6.trim());
        
        
        System.out.println("**************************************");
        
        /*
         * This method returns he character located at the String's specified index.
         * The string inexes start from zero.
         */
        String str7="We might be done early today";
        System.out.println(str7.charAt(3));
		
        System.out.println("**************************************");
        
        /* 
         * This method returns the index within this String
         * of the first occurrence of the specified character or -1
         * if the character does not occur
         */
        
        String str8="We might not be done early";
        System.out.println(str8.indexOf('e'));
        System.out.println(str8.indexOf('e', 4));
        
	}
}
