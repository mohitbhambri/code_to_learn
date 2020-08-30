package com.java.codingchallenges.String;

public class SubSequenceString {

	public static void main(String[] args) {
	      String str1 = "gksrek"; 
	        String str2 = "geeksforgeeks"; 
	        int m = str1.length(); 
	        int n = str2.length(); 
	        boolean res = subSequenceString(str1, str2, m, n); 
	          
	        if(res) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 

	}
	
	static boolean subSequenceString(String str1, String str2, int strLen1, int strLen2) {
		int j=0;
		for(int i=0;i<strLen2 && j<strLen1;i++) {
			if(str1.charAt(j) == str2.charAt(i)) {
				j++;
			}
		}
		return (j==strLen1);
		
	}
}
