package com.java.codingchallenges.arrays;

import java.util.Arrays;

public class MovingZeroes {

	public static void main(String[] args) {
		int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 
                7, 0, 6, 0, 9};
		movingZeroes(arr);
	}

	public static void movingZeroes(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0) 
			{
				swap(arr, i, count);
				count=count+1;
				//arr[count++]=arr[i];
			}
		}
		
//		while(count<arr.length) {
//			arr[count++]=0;
//		}
		System.out.println("Array after moving zeroes:"+ Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int count) {
		int temp=arr[count];
		arr[count]=arr[i];
		arr[i]=temp;
	}
}	
