package com.java.codingchallenges.Sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
		selectioSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectioSort(int[] arr) {
		int length = arr.length;
		for(int i=0;i<length;i++) {
			int min = i;
			int temp = arr[i];
			for(int j=i+1;j<length;j++) {
				if(arr[j] < arr[min]) {
					//update minimum
					min=j;
				}
			}
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
