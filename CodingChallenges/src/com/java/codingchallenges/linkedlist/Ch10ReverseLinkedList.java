package com.java.codingchallenges.linkedlist;


public class Ch10ReverseLinkedList {

    static Node<Integer> head;
	public static void main(String[] args) {
		Ch10ReverseLinkedList linkedList = new Ch10ReverseLinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.traverse();
		//linkedList.reverse();
		linkedList.reverseUsingRecursion(head);
		linkedList.add(5);
		linkedList.traverse();
	}
	
	public void add(int item) {
		Node<Integer> newNode = new Node<Integer>(item);
		if(head == null) {
			head = newNode; 
		}else {
			Node<Integer> temp = head;
			while(temp.next !=null) temp = temp.next;
			temp.next = newNode;
		}
	}
	
	static class Node<T>{
		int item;
		Node<T> next;
		
		Node(int item){
			this.item = item;
			this.next = null;
		}
	}
	void traverse() {
		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.println(temp.item);
			temp= temp.next;
		}
	}
	
	void reverse() {
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		Node<Integer> next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	void traverseRecursively(Node<Integer> node) {
		if(node.next == null) return;
		traverseRecursively(node.next);
		System.out.println(node.item);
	}
	
	void reverseUsingRecursion(Node<Integer> node) {
		if(node.next == null) {
			head = node;
			return;
		}
		reverseUsingRecursion(node.next);
		Node<Integer> newNode = node.next;
		newNode.next = node;
		node.next = null;
	}
}
