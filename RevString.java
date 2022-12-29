package com.example;

public class RevString {
	 public static void main(String[] args) {
		 String str = "Srinath";
		 String reversedStr = "";
		 for(int i = str.length()-1; i >= 0; i--){    
	            reversedStr = reversedStr + str.charAt(i);    
	        }
		 System.out.println("Original string: " + str);    
	     System.out.println("Reverse of given string: " + reversedStr);
	 }

}