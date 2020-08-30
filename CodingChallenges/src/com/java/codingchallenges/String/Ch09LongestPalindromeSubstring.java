package com.java.codingchallenges.String;


public class Ch09LongestPalindromeSubstring {
	
	int resultStart;
	int resultLength;
	
	public static void main(String[] args) {
		Ch09LongestPalindromeSubstring ch09 = new Ch09LongestPalindromeSubstring();
		String str = "madamfgf";
		//System.out.println(str+" is palindrome: "+isPalindrome(str));
		System.out.println(ch09.longestPalindrome(str));
	}
	
	public String longestPalindrome(String str) {
		int strlen = str.length();
		if(strlen<2) {
			return str;
		}
		for(int start=0;start<strlen-1;start++) {
			checkPalindrome(str, start, start);
			checkPalindrome(str, start, start+1);
		}
		
		return str.substring(resultStart, resultStart+resultLength);
		
	}
	
	public static boolean isPalindrome(String str) {
		int len = str.length();
		for(int i=0;i<(len/2);i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) {
				return false;
			}
		}
		return true;
		
		
//		int i = 0;
//		int j =	str.length()-1;
//		
//		while(i<j) {
//			if(str.charAt(i) != str.charAt(j)) {
//				return false;
//			}
//			i++;
//			j--;
//		}
//		return true;
	}
	
	private void checkPalindrome(String str, int begin, int end) {
		while(begin>=0 && end<str.length() && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		if(resultLength<end-begin-1) {
			resultStart = begin+1;
			resultLength= end-begin-1;
		}
		String strSubstring = str.substring(resultStart, resultStart+resultLength);
	}
}
