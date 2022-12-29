package com.example;

public class DupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Java lanaguage";
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		    	
		     System.out.print(inp[j]+",");
		     break;
		    }
		   }
		  }

	}

}
