package com.java.codingchallenges.arrays;

import java.util.Arrays;
import java.util.Collections;

public class RotateArrayToRight {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 8};
		Integer arr1[] = {1, 2, 3, 4, 8};
		rotateArray(arr, 2);
		rotateWithCollections(arr1, 3);

	}
	
	public static void rotateArray(int[] arr, int k) {
		int[] newArray = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArray[(i+k)%arr.length] = arr[i];
		}
		System.out.println(Arrays.toString(newArray));
	}
	
	public static void rotateWithCollections(Integer [] arr, int k) {
		Collections.rotate(Arrays.asList(arr), k);
		System.out.println(Arrays.toString(arr));
	}
	
	  public static void rotate(int[] nums, int k) {
		    k %= nums.length;
		    reverse(nums, 0, nums.length - 1);
		    reverse(nums, 0, k - 1);
		    reverse(nums, k, nums.length - 1);
		  }
		  public static void reverse(int[] nums, int start, int end) {
		    while (start < end) {
		      int temp = nums[start];
		      nums[start] = nums[end];
		      nums[end] = temp;
		      start++;
		      end--;
		    }
		  }
		}
