package com.java.codingchallenges.Search;

import java.util.Arrays;

/**
 * @author mbhambri
 *
 */
public class Ch08BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,7,5,33,22,88,9,21,33};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int result = findElementWithBinarySearch(33, arr);
		if(result !=-1)
			System.out.println("Element found at position:"+result);
		else
			System.out.println("Element not found in the array");
	}
	
	public static int findElementWithBinarySearch(int element, int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = (start+end)/2;
			System.out.println("Start: "+start);
			System.out.println("End: "+end);
			if(element == arr[mid]) {
				return mid;
			}
			if(element <arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			System.out.println("Start at last: "+start);
			System.out.println("End at last: "+end);
		}
		return -1;
	}
}
