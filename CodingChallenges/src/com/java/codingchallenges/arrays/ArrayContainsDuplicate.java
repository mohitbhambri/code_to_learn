package com.java.codingchallenges.arrays;

import java.util.Arrays;

public class ArrayContainsDuplicate {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		System.out.println(containsDuplicate(arr));
		containsDuplicatesWithConstantSpace();
	}

	    public static boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums);
	        for(int i=1;i<nums.length;i++) {
	        	if(nums[i]==nums[i-1]) return true;
	        }
	    	return false;
	    }
	    
	    public static void containsDuplicatesWithConstantSpace() { 
	        int numRay[] = {0, 4, 3, 2, 7, 8, 2, 3, 1}; 
	   
	        for (int i = 0; i < numRay.length; i++) {
	        	System.out.println("Numarray mod:"+numRay[i] %  numRay.length);
	            numRay[numRay[i] %  numRay.length] = numRay[numRay[i] %  numRay.length] + numRay.length; 
	        } 
	        
	        System.out.println("The repeating elements are : "); 
	        for (int i = 0; i < numRay.length; i++) { 
	            if (numRay[i] >= numRay.length*2) { 
	                System.out.println(i + " "); 
	            } 
	        } 
	    } 
}
