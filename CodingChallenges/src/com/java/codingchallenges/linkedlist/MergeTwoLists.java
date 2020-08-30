package com.java.codingchallenges.linkedlist;

import java.util.List;

public class MergeTwoLists {
	 class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
		}
	public void inOrder(TreeNode root, List<Integer> nums) {
		if (root==null) return;
		inOrder(root.left, nums);
		nums.add(root.val);
		inOrder(root.right,nums);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
