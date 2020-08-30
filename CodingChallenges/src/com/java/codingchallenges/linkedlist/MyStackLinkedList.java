package com.java.codingchallenges.linkedlist;

public class MyStackLinkedList {
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	Node top;
	
	void push(int data) {
		Node newNode = new Node(data);
		if(top==null) {
			top=newNode;
		}else {
			newNode.next=top;
			top=newNode;
		}
	}
	
	void pop() {
		if(top==null) return;
		System.out.println("Deleting a element:"+top.data);
		top=top.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
