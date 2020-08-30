package com.java.codingchallenges.linkedlist;

import java.util.Stack;

public class MyLinkedList {
	class Node
	{
		int item;
		Node nextRef;
		Node (int item){
			this.item=item;
			this.nextRef=null;
		}
	}

	private Node head;
	private Node tail;
	
	public void add(int item) {
		Node newNode = new Node(item);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.nextRef=newNode;
			tail= newNode;
		}
	}
	
	public void delete(int item) {
		Node tempNode= head, prev=null;
		// if node to be deleted is head node
		if(tempNode!=null && item==tempNode.item) {
			head=tempNode.nextRef;
			return;
		}
		// Search for the item to be deleted, keep track of the 
        // previous node as we need to change temp.next 
		while(tempNode!=null && item!=tempNode.item) {
			prev=tempNode;
			tempNode=tempNode.nextRef;
		}
		
		// If key was not present in linked list 
        if (tempNode == null ) return; 
        
        // Unlink the node from linked list 
        System.out.println("Deleted item is: "+ tempNode.item);
        if(tempNode == tail) {
        	tail = prev;
        }
        prev.nextRef = tempNode.nextRef;
        System.out.println("Priniting tail:"+tail.item);
	}
	
	public void addFront(int item) {
		Node newNode= new Node(item);
		if(head == null) {
			head = newNode;
		}else {
			newNode.nextRef=head;
			head=newNode;
		}
	}
	public void deleteFront() {
		if(head!=null) {
			head=head.nextRef;
			//System.out.println("Tail is:"+tail.item);
			if(head==null);
			{
				tail=null;
			}
		}
		
	}
	

	//Reverse a linked list
	public void reverseLinkedList() {
		Node current = head, prev= null, next=null;
		while(current!=null) {
			next = current.nextRef;
			current.nextRef=prev;
			prev = current;
			current=next;
		}
		head = prev;
	}
	
	//Reverse a linked list using recursion
	public void revLinkedRecursion(Node current) {
		if(current.nextRef == null) {
			head=current;
			return;
		}
		revLinkedRecursion(current.nextRef);
		Node next = current.nextRef;
		next.nextRef= current;
		current.nextRef=null;
	}
	
	//Reverse a linked list using stack
	void reverseUsingStack() {
		Stack<Node> stack = new Stack<Node>();
		Node temp = head;
		while(temp.nextRef!=null) {
			stack.push(temp);
			temp=temp.nextRef;
		}
		temp = stack.pop();
		head=temp;
		while(!stack.isEmpty()) {
			temp.nextRef=stack.pop();
			temp=temp.nextRef;
		}
		temp.nextRef=null;
	}
	
	void traverseList() {
		Node tempNode = head;
		while(true) {
			if(tempNode == null) break;
			System.out.println(tempNode.item);
			tempNode=tempNode.nextRef;
		}
	}
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(10);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.addFront(90);
		//linkedList.deleteFront();
		//linkedList.addFront(90);
		linkedList.delete(40);
		linkedList.traverseList();
		
//		linkedList.reverseLinkedList();
//		linkedList.traverseList();
//		linkedList.revLinkedRecursion(linkedList.head);
//		linkedList.traverseList();
	}

}
