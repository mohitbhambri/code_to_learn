package com.java.codingchallenges.hashtables;

import java.util.HashSet;
import java.util.Set;

public class RecurringCharacter {

	public static void main(String[] args) {
		int[] arr = {1,3,2};
		System.out.println(recurringCharacter(arr));
		
	}
	
	public static int recurringCharacter(int[] arr) {
		if(arr.length<=1) return -1;
		Set<Integer> visited = new HashSet<>();
		int i;
		for(i=0;i<arr.length;i++) {
			if(visited.contains(arr[i])) {
				return arr[i];
			}
			visited.add(arr[i]);
		}
		return -1;
	}

}
