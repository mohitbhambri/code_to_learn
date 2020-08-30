package com.java.codingchallenges.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,40,50,50};
		int length = arr.length; 
		length = removeDuplicates(arr, length);
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Length: "+ removeDuplicateUsingArrayList(arr, length));
	}

	public static int removeDuplicates(int[] arr, int length) {
		int n = length;
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				arr[j++]= arr[i];
			}
		}
		arr[j++] = arr[n-1];
		return j;
	}
	
	public static int removeDuplicateUsingArrayList(int[] arr, int length) {
		List<Integer> arrList = new ArrayList<>();
		for(int i=0;i<length;i++) {
			if(!arrList.contains(arr[i])) {
				arrList.add(arr[i]);
			}			
		}
		return arrList.size();
	}
}
