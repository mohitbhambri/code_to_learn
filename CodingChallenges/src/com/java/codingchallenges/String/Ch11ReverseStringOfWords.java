package com.java.codingchallenges.String;


public class Ch11ReverseStringOfWords {

	public static void main(String[] args) {
		System.out.println(reverseWordsInString("I will change my job"));
		
	}
	
	public static String reverseWordsInString(String str) {
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
		}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
		}
	}

