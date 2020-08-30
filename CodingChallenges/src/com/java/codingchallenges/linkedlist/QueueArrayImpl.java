package com.java.codingchallenges.linkedlist;

public class QueueArrayImpl {

	int queueArray[];
	int front=-1;
	int rear=-1;
	private int capacity;
	
	public QueueArrayImpl(int queueSize) {
		this.capacity=queueSize;
		this.queueArray = new int[queueSize];
	}
	
	void enqueu(int item) {
		if(isFull()) {
			System.out.println("Overflow! cannot add more items");
			return;
		}else if(isEmpty()) {
			front=rear=0;
		}else {
			rear=(rear+1)%capacity;
		}
		queueArray[rear]=item;
	}
	
	void dequeue() {
		if(isEmpty()) {
			System.out.println("Underflow! No elements to remove");
			return;
		}
		else if(front==rear){
			front=rear=-1;
		}else {
			System.out.println("Element to be deleted:"+queueArray[front]);
			front=(front+1)%capacity;
		}
	}
	
	private boolean isEmpty() {
		return (front==-1 && rear==-1);
	}

	private boolean isFull() {
		return (rear+1)%capacity == front ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
