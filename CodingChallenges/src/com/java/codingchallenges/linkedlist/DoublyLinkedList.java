package com.java.codingchallenges.linkedlist;

public class DoublyLinkedList {

	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	Node head;
	void insertAtHead(int item) {
		Node newNode = new Node(item);
		if(head==null) {
			head = newNode;
		}else {
			head.prev=newNode;
			newNode.next=head;		
			head=newNode;
		}
	}
	
	void traverse() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp= temp.next;
		}
	}
	
	void reverse() {
		Node current = head;
		Node temp = null;
		while(current !=null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if(temp != null)
			head = temp.prev;
	
		
	}
	public static void main(String[] args) {
		DoublyLinkedList dList = new DoublyLinkedList();
		dList.insertAtHead(10);
		dList.insertAtHead(20);
		dList.insertAtHead(30);
		dList.insertAtHead(40);
		//dList.reverse();
		dList.traverse();
	}

}
