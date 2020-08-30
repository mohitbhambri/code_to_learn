package com.java.codingchallenges.Sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
		insertionSort(arr);
		System.out.println("Array after sorting:"+Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int value = arr[i];
			int insertIndex = i;
			
			while(insertIndex>0 && arr[insertIndex-1] > value) {
				arr[insertIndex] = arr[insertIndex-1];
				insertIndex = insertIndex-1;
			}
			arr[insertIndex] = value;
		}
		}
}
