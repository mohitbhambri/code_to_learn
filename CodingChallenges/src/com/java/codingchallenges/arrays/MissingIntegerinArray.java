package com.java.codingchallenges.arrays;

import java.util.Arrays;

public class MissingIntegerinArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 6, 3, 7, 8};
		
		
		long startTime = System.currentTimeMillis();
		System.out.println(getMissingNoxOR(arr, arr.length));
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total time:"+ (endTime-startTime));
	}
	
	static void findMissing(int[] arr) {
		int n = arr.length+1;
		int sumOfIntegers = (n + 1)*n/2;
		int totalSum = Arrays.stream(arr).sum();
		int missingNo = sumOfIntegers - totalSum;
		System.out.println("Missing no is: "+missingNo);
		
	}

	static int getMissingNo(int a[], int n)  
    { 
        int total = 1; 
        for (int i = 2; i <= (n + 1); i++) 
        { 
            total += i; 
            total -= a[i - 2]; 
        } 
        return total; 
    } 
	
	 static int getMissingNoxOR(int a[], int n) 
	    { 	
	        int x1 = a[0]; 
	        int x2 = 1; 
	  
	        /* For xor of all the elements  
	           in array */
	        for (int i = 1; i < n; i++) 
	            x1 = x1 ^ a[i]; 
	  
	        /* For xor of all the elements  
	           from 1 to n+1 */
	        for (int i = 2; i <= n + 1; i++) 
	            x2 = x2 ^ i; 
	  
	        return (x1 ^ x2); 
	    } 
}
