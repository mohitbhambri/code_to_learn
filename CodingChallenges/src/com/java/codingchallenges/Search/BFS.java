package com.java.codingchallenges.Search;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	Node root;
	public BFS() {
		this.root = null;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(this.root == null) {
			this.root = newNode;
		}else {
			Node currentNode= this.root;
			while(true) {
				if(data<currentNode.data) {
					//go left
					if(currentNode.left == null) {
						currentNode.left = newNode;
						return;
					}
					currentNode = currentNode.left;
					
				}else {
					if(currentNode.right == null) {
						currentNode.right = newNode;
						return;
					}
					currentNode = currentNode.right;
				}
			}
		}
		
	}
	
	//In order traversal gives you sorted elements
	void inOrderTraversal(Node root) {
		if(root == null) return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	
	
	public int lookup(int data) {
		if(this.root == null) return -1;
		Node currentNode = this.root;
		while(currentNode !=null) {
			if(data == currentNode.data) return currentNode.data;
			else if(data<currentNode.data) {
				currentNode = currentNode.left;
			}else {
				currentNode = currentNode.right;
			}
		}
		return -1;
	}
	
	public List<Integer> breadthFirstSearch(Node root) {
		Node currentNode = root;
		List<Integer> nodeList = new LinkedList<>();
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(currentNode);
		
		while(!queue.isEmpty()) {
			currentNode = queue.poll();
			nodeList.add(currentNode.data);
			
			if(currentNode.left !=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right !=null) {
				queue.add(currentNode.right);
			}
		}
		return nodeList;
	}
	
	//Recursive BFS
	public List<Integer> breadthFirstSearchRec(Queue<Node> queue, List<Integer> nodeList) {
		if(queue.isEmpty()) {
			return nodeList;
		}
		Node currentNode = queue.poll();
		nodeList.add(currentNode.data);
		if(currentNode.left !=null) {
			queue.add(currentNode.left);
		}
		if(currentNode.right !=null) {
			queue.add(currentNode.right);
		}
		return breadthFirstSearchRec(queue, nodeList);
	}
	
	public static void main(String[] args) {
		BFS bst = new BFS();
		List<Integer> nodeList = new LinkedList<>();
		Queue<Node> queue = new ArrayDeque<>();
		bst.insert(9);
		bst.insert(4);
		bst.insert(6);
		queue.add(bst.root);
		//bst.inOrderTraversal(bst.root);
		//System.out.println(bst.breadthFirstSearch(bst.root));
		System.out.println(bst.breadthFirstSearchRec(queue, nodeList));
	}
}
