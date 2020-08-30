package com.java.codingchallenges.linkedlist;
import java.util.Stack;

public class TwoStackQueue {

	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	public static void main(String[] args) {
		TwoStackQueue queue = new TwoStackQueue();
		queue.Enqueue(20);
		queue.Dequeue();
		queue.Enqueue(5);
		queue.Enqueue(18);
		queue.Dequeue();
		queue.Enqueue(10);
		queue.Dequeue();
		queue.Dequeue();
	}

	public void Enqueue(int item)
	{
       	stack1.push(item);	
	}
	public int Dequeue(){
		while(!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
		}
		int popped = stack2.pop();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
			}
		System.out.println("Item popped is: "+popped);
		return popped;
	}
	

	
	
}
