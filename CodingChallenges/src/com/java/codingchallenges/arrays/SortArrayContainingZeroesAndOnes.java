package com.java.codingchallenges.arrays;

import java.util.Arrays;

public class SortArrayContainingZeroesAndOnes {

	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		int[] arr2 = { 1, 0, 0, 1, 0, 1, 0, 
                1, 1, 1, 1, 1, 1, 0, 
                0, 1, 1, 0, 1, 0, 0 }; 
		sortArray(arr);
		sortArrayInOneTraversal(arr2);
		System.out.println("Array after sorting: "+ Arrays.toString(arr));
		System.out.println("Array2 after sorting: "+ Arrays.toString(arr2));
	}
	
	static void sortArray(int [] arr) {
		int length = arr.length;
		int count = 0;
		for(int i=0 ;i<length;i++) {
			if(arr[i]==0)
				count=count+1;
		}
		
		for(int j =0;j<length;j++) {
			if(count !=0) {
				arr[j] = 0;
				count--;
			}
			else {
					arr[j]=1;
				}	
		}	
	}
	
	static void sortArrayInOneTraversal(int[] arr2) {
		int length = arr2.length;
		int j =-1;
		for(int i=0;i<length;i++) {
			if(arr2[i]<1) {
				j++;
				int temp = arr2[j]; 
                arr2[j] = arr2[i]; 
                arr2[i] = temp; 
			}
		}
		
	}
}
