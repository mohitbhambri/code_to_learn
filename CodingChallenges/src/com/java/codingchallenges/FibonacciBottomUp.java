package com.java.codingchallenges;

import java.math.BigInteger;
import java.util.Arrays;

public class FibonacciBottomUp {
	
	long result;
	
	long fibonacci(int n) {	
		if(n==1 || n==2) {
			result=1;
		}
		else {
			result= fibonacci(n-1)+fibonacci(n-2);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciBottomUp calFib = new FibonacciBottomUp();
		System.out.println(calFib.fibonacci(5));
		calFib.fibonacci_bottomUp(100);
	}
	
	void fibonacci_bottomUp(int n) {
		BigInteger a = BigInteger.valueOf(1); 
        BigInteger b = BigInteger.valueOf(1); 
        BigInteger c = BigInteger.ZERO;
        if(n==1 || n==2) {
        	System.out.println(1);
        	return;
        	}
        
        for (int j=3 ; j<=n ; j++) 
        { 
            c =  a.add(b); 
            a = b; 
            b = c; 
        } 
        System.out.println(c);
	}
}
