package com.java.codingchallenges.linkedlist;

public class AddTwoLinkedLists {

	
	static class Node
	{
		int item;
		Node nextRef;
		Node (int item, Node nextRef){
			this.item=item;
			this.nextRef=nextRef;
		}
	}

	static void traverse(Node head) {
		{
			Node ptr = head;
			while (ptr != null) {
				System.out.print(ptr.item + " -> ");
				ptr = ptr.nextRef;
			}

			System.out.println("null");
		}
	}
	
	// Iterate through the list and move/insert each node to the
	// front of the out list like a Push of the node
	public static Node reverse(Node head)
	{
		Node out = null;
		Node current = head;

		// traverse the list
		while (current != null)
		{
			// tricky: note the next node
			Node next = current.nextRef;

			// move the current node onto the out
			current.nextRef = out;
			out = current;

			// process next node
			current = next;
		}

		// fix head
		return out;
	}

	
	static Node add(Node first, Node second) {
		Node head = null;
		Node prevNode = null;
		int carry=0;
		
		while(first!=null || second!=null) {
			// sum is X's data + Y's data + carry (if any)
			
			int sum = 0;
			if (first != null) {
				sum += first.item;
			}
			if (second != null ) {
				sum += second.item;
			}
			sum += carry;
			
			carry = sum/10;
			sum = sum%10;
			
			Node newNode = new Node(sum, null);
			
			if(head == null) 
			{
				prevNode = newNode;
				head = newNode;
			}else {
				prevNode.nextRef = newNode;
				prevNode = newNode;
			}
			
            if (first != null) { 
                first = first.nextRef; 
            } 
            if (second != null) { 
                second = second.nextRef; 
            } 
		}
		if(carry!=0) {
			System.out.println("Previus Node next ref :"+prevNode.nextRef);
			prevNode.nextRef = new Node(carry, null);
		}
		return head;
	}
	
	public static Node addLists(Node first, Node second) {
		first = reverse(first);
		second = reverse(second);
		return reverse(add(first, second));
	}
	public static void main(String[] args) {
		int x = 312;
		int y = 721;

		// construct list X (2 -> 1 -> 3) from number x
		Node X = null;
		while (x != 0)
		{
			X = new Node(x % 10, X);
			x = x/10;
		}

		// construct list Y (1 -> 2 -> 7) from number y
		Node Y = null;
		while (y != 0)
		{
			Y = new Node(y % 10, Y);
			y = y/10;
		}
		System.out.println("First List:");
		traverse(X);
		
		System.out.println("Second List:");
		traverse(Y);
		
		System.out.println("After adding two lists:");
		traverse(addLists(X, Y));
	}	
	}
