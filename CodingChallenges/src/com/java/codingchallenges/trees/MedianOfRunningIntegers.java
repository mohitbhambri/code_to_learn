package com.java.codingchallenges.trees;


import java.awt.image.SampleModel;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MedianOfRunningIntegers {
	
	private static LinkedList<Integer> myList;
	private Queue<Integer> minHeap, maxHeap;
	LinkedList<Integer> smallerHalf = new LinkedList<Integer>();
	LinkedList<Integer> largerHalf = new LinkedList<Integer>();
	public MedianOfRunningIntegers() {
		minHeap = new PriorityQueue<>();
		maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	}
	
	public static void main(String[] args) {
//		myList = new LinkedList<Integer>();
//		addElement(7);
//		addElement(9);
//		System.out.println(myList);
//		System.out.println("Median is :"+ getMedian());
		MedianOfRunningIntegers med = new MedianOfRunningIntegers();
//		med.addHeap(4);
//		med.addHeap(1);
//		med.addHeap(5);
//		med.addHeap(10);
//		med.addHeap(7);
		med.addElementTwoList(4);
		med.addElementTwoList(1);
		med.addElementTwoList(5);
		med.addElementTwoList(10);
		med.addElementTwoList(7);
		//System.out.println("Median with heap: "+med.getHeapMedian());
		System.out.println("Median without heap: "+med.getSortedListMedian());
		System.out.println("LargerHalf: "+med.largerHalf);
		System.out.println("SmallerHalf: "+med.smallerHalf);
	}
	
	public static void addElement(int num) {
		myList.add(num);
		Collections.sort(myList);
	}
	
	public static double getMedian() {
		int length = myList.size();
		if (length ==0) return -1;
		if(length % 2 == 0) 
			return (double)(myList.get(length/2) + myList.get((length-1)/2))/2.0;
		
		return  (double) myList.get(length/2);
	}
	
	public void addElementTwoList(int num) {
		
		if(!largerHalf.isEmpty() && num < largerHalf.get(0)) {
			smallerHalf.add(num);
			if(smallerHalf.size()>largerHalf.size()+1) {
				largerHalf.offer(smallerHalf.poll());
			}
		}else {
			largerHalf.add(num);
			if(largerHalf.size()>smallerHalf.size()+1) {
				smallerHalf.offer(largerHalf.poll());
			}
		}
		Collections.sort(smallerHalf, Comparator.reverseOrder());
		Collections.sort(largerHalf);
	}
	
	double getSortedListMedian() {
		   int median;
	        if (largerHalf.size() < smallerHalf.size()) {
	            median = smallerHalf.peek();
	        } else if (largerHalf.size() > smallerHalf.size()) {
	            median = largerHalf.peek();
	        } else {
	            median = (largerHalf.peek() + smallerHalf.peek()) / 2; 
	        }
	        return median;
	    }
	
	void addHeap(int num) {
		if(!minHeap.isEmpty() && num < minHeap.peek()) {
			maxHeap.offer(num);
			if(maxHeap.size()>minHeap.size()+1) {
				minHeap.offer(maxHeap.poll());
			}
		}else {
			minHeap.offer(num);
            if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.offer(minHeap.poll());
            }
		}
	}
	
	double getHeapMedian() {
		   int median;
	        if (minHeap.size() < maxHeap.size()) {
	            median = maxHeap.peek();
	        } else if (minHeap.size() > maxHeap.size()) {
	            median = minHeap.peek();
	        } else {
	            median = (minHeap.peek() + maxHeap.peek()) / 2; 
	        }
	        return median;
	    }
	
	void addVariant(int num) {
        if (minHeap.size() == maxHeap.size()) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        } else {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
    }
 
    double getMedianVariant() {
        int median;
        if (minHeap.size() > maxHeap.size()) {
            median = minHeap.peek();
        } else {
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        }
        return median;
    }
	}
