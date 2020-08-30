package com.java.codingchallenges.String;

public class Ch05ReverseString {
	
	private static String reverseWithStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	private static String reverseManually(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static String reverseStringInPlace(String str) {
		char[] charArray = str.toCharArray();
		int i=0;
		int j=charArray.length-1;
		while(i<j) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(charArray);
	}
	public static void main(String[] args) {
		String str = "Dam";
		System.out.println(reverseWithStringBuilder(str));
		System.out.println(reverseManually(str));
		System.out.println(reverseStringInPlace("Mohits"));
	}

}
