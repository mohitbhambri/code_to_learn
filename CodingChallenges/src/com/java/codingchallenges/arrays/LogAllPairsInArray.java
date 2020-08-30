package com.java.codingchallenges.arrays;

import java.util.HashSet;
import java.util.Set;

public class LogAllPairsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,-2,3,4};
		System.out.println(logAllPairsBetter(input, 6));
		System.out.println(logAllPairsSorted(input,-1 ));
		
	}
	
	public static boolean logAllPairs(int[] input, int target) {
		for(int i =0;i<input.length;i++) {
			for(int j = i+1;j<input.length;j++) {
				if(input[i]+input[j] == target) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean logAllPairsBetter(int[] input, int target) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<input.length;i++) {
			if(set.contains(input[i])) {
				return true;
			}
			set.add(target-input[i]);
		}
		return false;
	}
	
	public static boolean logAllPairsSorted(int[] input, int target) {
		int i=0;
		int j=input.length-1;
		while(i<j) {
			int sum = input[i]+input[j];
			if(sum == target) return true;
			if(sum < target) {
				i++;
			}else {
				j--;
			}
		}
		return false;
	}
	
}
