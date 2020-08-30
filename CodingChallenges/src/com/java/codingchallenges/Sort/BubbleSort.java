package com.java.codingchallenges.Sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
		bubbleSort(arr);
		System.out.println("Array after sorting:"+Arrays.toString(arr));
	}
	
	static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]> arr[j+1]) {
					//Swap numbers
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
		}
	}
}	
