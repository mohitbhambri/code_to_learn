package com.java.codingchallenges.trees;

public class IsBinarySearchTree {
	
	class Node{
		int data;
		Node left, right;
		Node (int data){
			this.data=data;
			left = right = null;
		}
	}
	
	Node root;
	Node prev; 
	
	IsBinarySearchTree(){
		root = null;
	}
	
	void insert(int data) {
		root = insertRec(root, data);
	}
	
	Node insertRec(Node root, int data) {
		
		if(root == null) {
			root = new Node(data);
		}
		else if(data< root.data)
			root.left=insertRec(root.left, data);
		else
			root.right=insertRec(root.right, data);
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsBinarySearchTree tree = new IsBinarySearchTree();
		tree.insert(7);
		tree.insert(4);
		tree.insert(1);
		tree.insert(1);
		tree.insert(6);
		tree.insert(9);
		System.out.println(tree.isBST(tree.root));
		tree.inOrderTraversal(tree.root);
		System.out.println(tree.isBSTInOrder(tree.root));
		tree.delete(4);
		tree.inOrderTraversal(tree.root);
		Node result = tree.getSuccessor(tree.root, 1);
		if (result!=null){
			System.out.println("Successor is:"+ result.data);
		}else {
			System.out.println("Element not found!");
		}
		
	}
	
	boolean isBST(Node root) {
		prev=null;
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean isBSTUtil(Node root, int minVal, int maxVal) {
		if (root == null) return true;
		if (root.data>=minVal && root.data<maxVal && isBSTUtil(root.left, minVal, root.data) 
				&& isBSTUtil(root.right, root.data, maxVal)) return true;
		else
			return false;
	}
	
	boolean isBSTInOrder(Node root) {
		//null tree is BST
		if(root == null) return true;
		
		if (!(isBSTInOrder(root.left)))return false;
		if (prev!=null && root.data<prev.data) return false;
		prev = root;
		return isBSTInOrder(root.right);
	}
	
	void inOrderTraversal(Node root) {
		if(root == null) return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	
	Node findMin(Node root) {
		if( root == null) return root;
//		else if(root.left== null) return root;
//		return findMin(root.left);
		// or 
		while(root.left != null) 
			root = root.left;
		return root;
	}
	
	//Delete a node from tree
	void delete(int data) {
		root = deleteFromTree(root, data);	
	}
	
	//Delete Node from tree util
	Node deleteFromTree(Node root, int data){
		if (root == null) return root;
		else if (data<root.data) root.left = deleteFromTree(root.left,data);
		else if (data>root.data) root.right = deleteFromTree(root.right,data);
		else {
			//Case 1 : No child
			if(root.left == null && root.right == null) {
				return null;
			}
			//Case 2 : One child in left
			else if(root.left == null) {
				root=root.right;
			}
			else if(root.right == null) {
				root=root.left;
			}
			//Case 3 : 2 Children
			else {
				Node temp = findMin(root.right);
				System.out.println("Temp data is:" +temp.data);
				root.data=temp.data;
				root.right=deleteFromTree(root.right, temp.data);
			}
		}
		return root;
	}
	
	Node getSuccessor(Node root, int data) {
		Node current = findNode(root, data);
		if(current == null) return null;
		//Case1: If current node has right subtree
		if(current.right !=null) {
			return findMin(root.right);
		}
		//Case2: No right subtree
		else {
			Node successor = null;
			Node ancestor = root;
			while(ancestor != current) {
				if(current.data < ancestor.data) {
					successor=ancestor;
					ancestor=ancestor.left;
				}
				else {
					ancestor=ancestor.right;
				}
			}
			return successor;
		}
	}
	
	Node findNode(Node root, int data) {
		if(root == null) return null;
		else if(data< root.data) return root.left = findNode(root.left,data);
		else if(data> root.data) return root.right = findNode(root.right,data);
		else {
			return root;
		}
	}
}
