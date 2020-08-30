package com.java.codingchallenges.Sort;

import java.util.Arrays;

public class QuickSort {
	
	public int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pIndex = start;
		for(int i=start;i<end;i++) {
			if(arr[i]<=pivot) {
				swapNumbers(arr, i, pIndex);
				pIndex++;
			}
		}
		swapNumbers(arr, pIndex, end);
		return pIndex;
	}
	
	public void swapNumbers(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	public void quickSort(int[] arr, int start, int end) {
		if(start<end) {
		int pIndex = partition(arr, start, end);
		quickSort(arr, start, pIndex-1);
		quickSort(arr, pIndex+1, end);
		}
	}
		

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		int[] arr = {10, 10, -2, 9, 1, 5};
		sort.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
