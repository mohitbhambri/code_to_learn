package com.java.codingchallenges.trees;


public class BinarySerachTree {
	
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
	
	public BinarySerachTree() {
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
	
	
	public static void main(String[] args) {
		BinarySerachTree bst = new BinarySerachTree();
		bst.inOrderTraversal(bst.root);
		bst.insert(9);
		bst.insert(4);
		bst.insert(6);
		bst.inOrderTraversal(bst.root);
		System.out.println(bst.lookup(4));
	}
}
