package com.java.codingchallenges;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public static List<List<Integer>> subsets(int[] nums) {
	       List<List<Integer>> result=new ArrayList<List<Integer>>();
	        result.add(new ArrayList<Integer>());
	        for(int i=0;i<nums.length;i++){
	            int n=result.size();
	            for(int j=0;j<n;j++){
	                List <Integer> tmp = new ArrayList<>(result.get(j));
	                tmp.add(nums[i]);
	                result.add(tmp);
	            }
	        }
	        return result;
	    }

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));

	}

}
