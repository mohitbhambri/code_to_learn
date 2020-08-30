package com.java.codingchallenges.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonItemsInTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1= {1, 3, 4, 6, 7, 9};
		int[] arr2= {1, 2, 4, 5, 9, 10};
		System.out.println("CommonArray items:"+Arrays.toString(commonElements(arr1, arr2)));
	}
	
	public static Integer[] commonElements(int[] arr1, int[] arr2) {
		List<Integer> result = new ArrayList<>();
		int p1Index=0;
		int p2Index=0;
		
		while(p1Index<arr1.length && p2Index < arr2.length) {
			if(arr1[p1Index] == arr2[p2Index]) {
				result.add(arr1[p1Index]);
				p1Index +=1;
				p2Index +=1;
			}else if(arr1[p1Index]>arr2[p2Index]) {
				p2Index +=1;
			}else {
				p1Index +=1;
			}
		}
		return result.toArray(new Integer[result.size()]);
	}
}
