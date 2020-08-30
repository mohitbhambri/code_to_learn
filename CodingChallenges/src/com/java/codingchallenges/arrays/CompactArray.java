package com.java.codingchallenges.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mbhambri
 * Given a sorted array with no duplicates
 * compact the array based on contiguous range of numbers
 * if there are no such ranges available output the list of strings
 * where each element is string notation of the number
 * Input integer array
 * Output list of Strings
 */
public class CompactArray {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 6, 7, 8, 10, 11, 13};
		int[] B = {10, 20, 30, 40};
		System.out.println(compactArray(A));

	}

	public static List<String> compactArray(int[] A){
		List<String> output = new ArrayList<>();
		int i =0;
		int j =0;
		
		while(i<A.length) {
			j=i;
			
			while(j+1<A.length && A[j+1] == A[j]+1) {
				j++;
			}
			
			//no contiguous range
			if(i==j) {
				output.add(String.valueOf(A[i]));
				i++;	
			}else {
				output.add(String.valueOf(A[i]) + " to " + A[j]);
				i = j+1;
			}
		}
		return output;
	}
}
