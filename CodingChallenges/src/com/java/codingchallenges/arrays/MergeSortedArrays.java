package com.java.codingchallenges.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {2,3,5,6};
		//System.out.println("Arrays:"+Arrays.toString(mergeSortedArrays(arr1, arr2)));
		mergeSortedArraysInPlace(arr1, arr2);
		System.out.println("Arrays:"+Arrays.toString(mergeSortedArrays(arr1, arr2)));
	}
	
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		
		//check input
		if(arr1.length == 0) {
			return arr2;
		}
		
		if(arr2.length == 0) {
			return arr1;
		}
		
		
		int k=0;
		int i=0;
		int j=0;
		int arr1Length= arr1.length;
		int arr2Length= arr2.length;
		int[] mergedArray = new int[arr1Length+arr2Length];
		
		while(i<arr1Length && j<arr2Length) {
			if(arr1[i]<arr2[j]) {
				mergedArray[k++] = arr1[i++];
			}else {
				mergedArray[k++]= arr2[j++];
			}
		}
		
		
		
		while(i<arr1Length) {
			mergedArray[k++] = arr1[i++];
		}
		while(j<arr2Length) {
			mergedArray[k++] = arr2[j++];
		}
		return mergedArray;
		}
	
	public static void mergeSortedArraysInPlace(int[] arr1, int[] arr2) {
		int arr1Length= arr1.length;
		int arr2Length= arr2.length;
		
		for(int i=0;i<arr1Length;i++) {
			// compare current element of arr1[] with first element of arr2[]
			if(arr1[i]>arr2[0]) {
				//swap arr1[i] arr2[0]
				int temp = arr1[i];
				arr1[i]= arr2[0];
				arr2[0]= temp;
				
				int first = arr2[0];
				int j;
				for(j=1;j<arr2Length && arr2[j]< first;j++) {
					arr2[j-1]=arr2[j];
				}
				arr2[j-1]=first;
			}
		}
	}
}