package com.java.codingchallenges.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [20,32,16,19,27,66,88,3,7]
		// num = 24
		// [3,7,16,19,32,66,27,88]
		List<Integer> aList= Arrays.asList();
		getList(aList,24);
	}
	
	public static void getList(List<Integer> aList, int num) {
		List<Integer> lessThanNumList = new ArrayList<>();
		List<Integer> greaterThanNumList = new ArrayList<>();
		
		
		for(int listNumber: aList) {
			if(listNumber < num) {
				lessThanNumList.add(listNumber);
			}
			else {
				greaterThanNumList.add(listNumber);
			}
		}
		//lessThanNumList.addAll(greaterThanNumList);
		
		List<Integer> newList = Stream.concat(lessThanNumList.stream(), greaterThanNumList.stream()) .collect(Collectors.toList());
        System.out.println("Merged List: "+ newList);
		
	}
	
	
}

