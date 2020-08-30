package com.java.codingchallenges.linkedlist;

public class MyStack {
	
	private int[] stackArray;
	private int capacity;
	private int top;
	
	public MyStack(int capacity) 
	{
		this.stackArray = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	public void push(int item) {
		if(isFull()) {
			throw new RuntimeException("Stack is full! Cannot push more items");
		}
		stackArray[++top] = item;
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty! Cannot pop more items");
		}
		return stackArray[top--];
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty! Cannot peek more items");
		}
		return stackArray[top];
	}
	
	public boolean isFull() {
		return top == capacity-1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	
	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
		stack.push(9);
		stack.push(8);
		System.out.println(stack.pop());
		stack.push(7);
		System.out.println(stack.peek());
	}

}
