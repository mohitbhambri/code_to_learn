package com.java.codingchallenges.String;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseStringUsingStack {

	static String reverseString(String str) {
		Deque<Character> stack = new ArrayDeque<>();
		char[] characters = str.toCharArray();
		for(char ch : characters) {
			stack.push(ch);
		}
		for(int i =0;i<characters.length;i++) {
			characters[i]=stack.pop();
		}
		return String.copyValueOf(characters);
	}
	
	static String reverseUsingSwap(String str) {
		char[] ch = str.toCharArray();
		int j=ch.length-1;
		for(int i=0;i<str.length();i++) {
			if(i!=j) {
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				j--;
			}else {
				break;
			}
		}
		return String.copyValueOf(ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = input.next();
		System.out.println(reverseString(str));
		System.out.println("Swap reverse:"+ reverseUsingSwap(str));
		input.close();
	}

}
