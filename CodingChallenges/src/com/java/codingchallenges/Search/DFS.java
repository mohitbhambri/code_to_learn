package com.java.codingchallenges.Search;

import java.util.LinkedList;
import java.util.List;

public class DFS {
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
	public DFS() {
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
	List<Integer> preOrderTraversal(Node node, List<Integer> nodeList) {
		nodeList.add(node.data);
		if(node.left != null) {
			preOrderTraversal(node.left, nodeList);
		}
		if(node.right != null) {
			preOrderTraversal(node.right, nodeList);
		}
		return nodeList;
	}

	//In order traversal gives you sorted elements
	List<Integer> inOrderTraversal(Node node, List<Integer> nodeList) {
		if(node.left != null) {
			inOrderTraversal(node.left, nodeList);
		}
		nodeList.add(node.data);
		if(node.right != null) {
			inOrderTraversal(node.right, nodeList);
		}
		return nodeList;
	}

	//In order traversal gives you sorted elements
	List<Integer> postOrderTraversal(Node node, List<Integer> nodeList) {
		if(node.left != null) {
			postOrderTraversal(node.left, nodeList);
		}
		if(node.right != null) {
			postOrderTraversal(node.right, nodeList);
		}
		nodeList.add(node.data);
		
		return nodeList;
	}



	public static void main(String[] args) {
		DFS dst = new DFS();
		dst.insert(9);
		dst.insert(4);
		dst.insert(6);
		dst.insert(1);
		System.out.println("Inorder:");
		System.out.println(dst.inOrderTraversal(dst.root, new LinkedList<Integer>()));
		System.out.println("Preorder:");
		System.out.println(dst.preOrderTraversal(dst.root, new LinkedList<Integer>()));
		System.out.println("Postorder:");
		System.out.println(dst.postOrderTraversal(dst.root, new LinkedList<Integer>()));
	}

}
