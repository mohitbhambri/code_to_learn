package com.java.codingchallenges.arrays;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentlyOccuringItemInArray {
	
	    public static void main(String[] args) {
	        // NOTE: The following input values are used for testing your solution.

	        // mostFrequent(array1) should return 1.
	        int[] array1 = {1, 3, 1, 3, 2, 1};
	        // mostFrequent(array2) should return 3.
	        int[] array2 = {3, 3, 1, 3, 2, 1};
	        // mostFrequent(array3) should return null.
	        int[] array3 = {};
	        // mostFrequent(array4) should return 0.
	        int[] array4 = {0};
	        // mostFrequent(array5) should return -1.
	        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
	        System.out.println("Array2:"+ mostFreqent(array3));
	    }

	    // Implement your solution below.
	    public static Integer mostFreqent(int[] givenArray) {
	        Integer maxItem = null;
	        Integer maxCount=-1;
	        
	        HashMap<Integer, Integer> visitedNumbers = new HashMap<>();
	        for(int i : givenArray){
	            if(visitedNumbers.containsKey(i)){
	                visitedNumbers.put(i, visitedNumbers.get(i)+1);
	            }else {
	            visitedNumbers.put(i, 1);
	            }
	            if (visitedNumbers.get(i) > maxCount) {
	                maxCount = visitedNumbers.get(i);
	                maxItem = i;
	            }
	        }
	        
	        return maxItem;
	    }
}
