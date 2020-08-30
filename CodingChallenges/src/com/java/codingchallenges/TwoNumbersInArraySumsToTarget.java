package com.java.codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.naming.spi.DirStateFactory.Result;


public class TwoNumbersInArraySumsToTarget {

	public static void main(String[] args) {
		Integer[] arr1 = {1,10,2,3,4};
		Integer[] arr2 = {3,6,7,8,4};
		//System.out.println(findTarget(arr1, arr2,11));
		System.out.println(Arrays.toString(findSum(arr1, arr2,11)));
	}
	
	public static String findTarget(int[] arr1, int[] arr2, int target) {
		HashMap<Integer, String> map = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				map.put(Math.abs((arr1[i]+arr2[j]) - target), arr1[i]+"+"+arr2[j]); 
					
			}
		}
		List<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);
		return map.get(keys.get(0));
	}
	
	public static Integer[] findSum(Integer[] arr1, Integer[] arr2, int target) {
		Set<Integer> set = new HashSet<>(Arrays.asList(arr1));
		Integer[] result = {};
		for(int i=0;i<arr2.length;i++) {
			Integer delta = Math.abs(target-arr2[i]);
			if(set.contains(delta)) {
				 result = new Integer[] {delta, arr2[i]};
			}
		}
		return result;
	}

}
