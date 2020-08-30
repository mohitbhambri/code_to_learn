package com.java.codingchallenges.trees;

import java.util.PriorityQueue;

public class KLargestUsingMinHeap {

	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
		for(int i: nums){
			q.offer(i);
			if(q.size()>k){
				q.poll();
			}
		}
		return q.peek();
	}

	public static void main(String[] args) {
		int[] nums = {3,4,1,2,5,6};
		System.out.println(findKthLargest(nums,5));
	}

}
