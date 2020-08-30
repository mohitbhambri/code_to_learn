package com.java.codingchallenges.Recursion;

import java.util.LinkedList;
import java.util.List;

public class FibonacciSeqNumberAtIndex {
	static Integer[] cache = new Integer[51];

	public static void main(String[] args) {
		//System.out.println(fibonacciSeq(8));
		cache[0] = 0;
		cache[1] = 1;
		System.out.println(fibonacciSeqRec(3));
	}
	
	static int fibonacciSeq(int num) {
		List<Integer> list = new LinkedList<>();
		list.add(0);
		list.add(1);
		for(int i=2;i<=num;i++) {
			list.add(list.get(i-1)+list.get(i-2));
		}
		return list.get(num);
	}
	
	static int fibonacciSeqRec(int num) {
		
		if(cache[num] != null) {
			return cache[num];
		}
		cache[num] = fibonacciSeqRec(num-1) + fibonacciSeqRec(num-2);
		return cache[num];
	}
}
