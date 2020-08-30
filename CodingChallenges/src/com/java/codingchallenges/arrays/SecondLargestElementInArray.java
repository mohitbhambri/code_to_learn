package com.java.codingchallenges.arrays;

public class SecondLargestElementInArray {
	
	public static int findSecondLargest(int[] arr) {
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		// check for edge cases when array has less than 2 items
		if(arr.length<2) {
			System.out.println("Array too small to have second largest element!");
			return -1;
		}
		
		// Now we will check every element and complete it for first and second position
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			}
		}
		
		if(secondLargest == Integer.MIN_VALUE) {
			System.out.println("Array has no 2nd largest element");
			return -1;
		}
		
		return secondLargest;	
	} 

	public static void main(String[] args) {
		int[] arr = {3,3};
		System.out.println(findSecondLargest(arr));

	}

}
