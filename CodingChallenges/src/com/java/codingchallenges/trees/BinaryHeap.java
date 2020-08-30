package com.java.codingchallenges.trees;

import java.util.Arrays;

public class BinaryHeap {

	private int capacity = 10;;
	private int heapSize = 0;

	int[] heap = new int[capacity];


	private int getleftChildIndex(int parentIndex) { return 2* parentIndex + 1; } 
	private int getrightChildIndex(int parentIndex) { return 2* parentIndex + 2; } 
	private int getParentIndex(int childIndex) { return  (childIndex-1) / 2; } 

	private boolean hasLeftChild(int index) { return getleftChildIndex(index) < heapSize;}
	private boolean hasRightChild(int index) { return getrightChildIndex(index) < heapSize;}
	private boolean hasParent(int index) { return getParentIndex(index) >= 0;}

	private int leftChild(int index) {return heap[getleftChildIndex(index)];}
	private int rightChild(int index) {return heap[getrightChildIndex(index)];}
	private int parent(int index) {return heap[getParentIndex(index)];}

	private void swap(int indexOne, int indexTwo) {
		int temp = heap[indexOne];
		heap[indexOne] = heap[indexTwo];
		heap[indexTwo] = temp;
	}

	private void ensureExtraCapacity() {
		if(heapSize == capacity) {
			heap = Arrays.copyOf(heap, capacity*2);
			capacity *=2;
		}
	}

	public int peek() {
		if(isEmpty()) throw new IllegalStateException();
		return heap[0];
	}

	public int poll() {
		if(isEmpty()) throw new IllegalStateException();
		int item = heap[0];
		heap[0] = heap[heapSize-1];
		heapSize--;
		heapifyDown();
		return item;
	}

	public void add(int item) {
		ensureExtraCapacity();
		heap[heapSize++] = item;
		heapifyUp();
	}


	public void heapifyUp() {
		int index = heapSize-1;
		while(hasParent(index) && parent(index) > heap[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}


	private void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index)) {
			int smallerChildIndex = getleftChildIndex(index);
			if(hasRightChild(index) && rightChild(index)<leftChild(index)) {
				smallerChildIndex = getrightChildIndex(index);
			}

			if(heap[index] < heap[smallerChildIndex]) {
				break;
			}else {
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
		}
	}

	boolean isEmpty() {
		return heapSize == 0;
	}

	boolean isFull() {
		return heapSize == heap.length;
	}


	public static void main(String[] args) {
		BinaryHeap minHeap = new BinaryHeap();
		minHeap.add(5); 
		minHeap.add(3); 
		minHeap.add(17); 
		minHeap.add(10); 
		minHeap.add(84); 
		minHeap.add(19); 
		minHeap.add(6); 
		minHeap.add(22); 
		minHeap.add(9); 
		minHeap.poll();
		minHeap.add(3);
		System.out.println("min element is: "+ minHeap.peek());

	}


}
