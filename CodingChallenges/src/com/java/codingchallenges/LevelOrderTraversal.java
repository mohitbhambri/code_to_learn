package com.java.codingchallenges;

import java.util.ArrayDeque;
import java.util.Deque;

public class LevelOrderTraversal {
	
	class Node{
		char data;
		Node left;
		Node right;
		
		Node(char data){
			this.data = data;
			this.left = this.right = null;
		}
	}
	Node root;
	
	LevelOrderTraversal(){
		root = null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.insert('M');
		tree.insert('B');
		tree.insert('Q');
		tree.insert('Z');
		tree.insert('A');
		tree.insert('C');
		
		tree.levelOrderTraverseal(tree.root);
	}
	
	void levelOrderTraverseal(Node root) {
		if (root==null)
			return;
		Deque<Node> queue = new ArrayDeque<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
		Node current = (Node) queue.getFirst();
		System.out.println(current.data);
		if(current.left!=null)queue.add(current.left);
		if(current.right!=null)queue.add(current.right);
		queue.pop();
		}	
	}
	
	void insert(char data) {
		root = insertRec(root, data);
	}
	
	Node insertRec(Node root, char data) {
		if (root == null) {
			root = new Node(data);
		}
		else if(data <= root.data)
			root.left = insertRec(root.left, data);
		else
			root.right = insertRec(root.right, data);
		
		return root;
	}
}
