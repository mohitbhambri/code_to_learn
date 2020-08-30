package com.java.codingchallenges.String;

public class Ch04ReverseInteger {
	
	public static long reverse(int input) {
		long reversed = 0;
		while(input !=0) {
			reversed = reversed*10 + input%10;
			System.out.println(reversed);
			input /=10;
			if(reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
				return 0;
			}	
		}
		return reversed;
	}

	public static void main(String[] args) {
		System.out.println("Reverse of integer 12345 = "+reverse(12345));

	}

}
